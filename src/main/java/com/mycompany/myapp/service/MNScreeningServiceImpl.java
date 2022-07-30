package com.mycompany.myapp.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.MNScreeningDTO;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.repository.MNScreeningDAO;
import com.mycompany.myapp.repository.MnMovieBoardDAO;

@Service
public class MNScreeningServiceImpl implements MNScreeningService {

	@Autowired
	MNScreeningDAO dao;

	@Override
	public List<MNScreeningDTO> getTitle() throws Exception {
		return dao.selectTitle();
	}

	@Override
	public List<MNScreeningDTO> getCinema() throws Exception {
		return dao.selectCinema();
	}

	@Override
	public List<MNScreeningDTO> getMovieTime() throws Exception {
		return dao.selectMovieTime();
	} 
	@Override
	public List<MNScreeningDTO> getScreeningList() throws Exception {
		return dao.selectScreeningList();
	}

	@Override
	public List<MNScreeningDTO> mnScreeningListCriteria(Criteria cri) throws Exception {
		return dao.mnScreeningListCriteria(cri);
	}

	@Override
	public int mnScreeninglistCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public void mnScreeningRegist(MNScreeningDTO dto) throws Exception {
		dao.mnScreeningRegist(dto);
	}

	@Override
	public List<MNScreeningDTO> getDist() throws Exception {
		return dao.selectDist();
	}

	@Override
	public void deletea(MNScreeningDTO dto) throws Exception {
		dao.delete(dto);
		
	}


	
	

}
