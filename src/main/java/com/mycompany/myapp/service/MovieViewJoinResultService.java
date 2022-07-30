package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.domain.MemberReplyJoinResultVO;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.dto.MovieCommentsDTO;

public interface MovieViewJoinResultService {

	//최신 개봉작 영화 목록
	public abstract List<MovieViewJoinResultVO> newMovieList() throws Exception; 
	//movie 목록
	
	// 박스오피스 영화 목록 
	public abstract List<MovieViewJoinResultVO> boxMovieList() throws Exception; 
	
	public abstract MovieViewJoinResultVO movieRead(String movie_num) throws Exception;
	//movie detail 정보 가져오기
}  //end interface
