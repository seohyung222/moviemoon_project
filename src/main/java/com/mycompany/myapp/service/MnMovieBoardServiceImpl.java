package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.dto.MnMovieFileDTO;
import com.mycompany.myapp.dto.MovieViewJoinResultDTO;
import com.mycompany.myapp.repository.MnMovieBoardDAO;

import mycompany.myapp.util.MnMovieFile;

@Service
public class MnMovieBoardServiceImpl implements MnMovieBoardService {

	@Autowired
	 MnMovieBoardDAO dao; 
	
	/* 관리자 영화 목록 */
	@Override
	public List<MovieViewJoinResultVO> mnMovieListAll() throws Exception {
		
		return dao.mnMovieListAll();
	}  //mnMovieListAll

	/* 관리자 영화 상세 */
	@Override
	public MovieViewJoinResultVO mnMovieRead(String movie_num) throws Exception {
		
		return dao.mnMovieRead(movie_num);
	}  //mnMovieRead
	
	/* 관리자 영화 등록 */
	@Override
	public void mnMovieRegist(MovieViewJoinResultDTO dto, MultipartFile[] files) throws Exception {
		
		dao.mnMovieRegist(dto);
		
		if(files != null) {
			MnMovieFile mnMovieFile = new MnMovieFile();  //MnMovieFile() 클래스 호출
			
			 List<MnMovieFileDTO> fileList = mnMovieFile.insertFile(dto, files);
			
			if(fileList != null) {
				for( MnMovieFileDTO mnMovieFileDTO : fileList) {
					dao.mnFileRegist(mnMovieFileDTO);
				}  //for
			}  //if
		}  //if
		
	}  //mnMovieRegist



	/* 관리자 영화 수정 */
	@Override
	public void mnMovieModify(MovieViewJoinResultDTO dto, MultipartFile[] files) throws Exception {
		
		dao.mnMovieModify(dto);
		
		boolean result = dao.checkExisted(dto.getMovie_num());
		
		if (result) {
			if(files != null) {
				MnMovieFile mnMovieFile = new MnMovieFile();  //MnMovieFile() 클래스 호출
				
				 List<MnMovieFileDTO> fileList = mnMovieFile.insertFile(dto, files);
				
				if(fileList != null) {
					for( MnMovieFileDTO mnMovieFileDTO : fileList) {
						dao.mnFileUpdate(mnMovieFileDTO);
					}  //for
				}  //if
			}  //if
		} else {
			if(files != null) {
				MnMovieFile mnMovieFile = new MnMovieFile();  //MnMovieFile() 클래스 호출
				
				 List<MnMovieFileDTO> fileList = mnMovieFile.insertFile(dto, files);
				
				if(fileList != null) {
					for( MnMovieFileDTO mnMovieFileDTO : fileList) {
						dao.mnFileRegist(mnMovieFileDTO);
					}  //for
				}  //if
			}  //if
		} // if-else
	} // mnMovieModify

	
	
	/* 페이징 처리 */
	@Override
	public List<MovieViewJoinResultVO> mnMovieListCriteria(Criteria cri) throws Exception {
		
		return dao.mnMovieListCriteria(cri);
	}
	
	@Override
	public int mnMovielistCountCriteria(Criteria cri) throws Exception {
	
		return dao.countPaging(cri);
	}
	
	/* 페이징 처리 */


	

}
