package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.MovieAvgScoreResultVO;
import com.mycompany.myapp.repository.MovieAvgScoreResultDAO;

@Service
public class MovieAvgScoreResultServiceImpl implements MovieAvgScoreResultService {

	@Autowired
	MovieAvgScoreResultDAO dao;
	
	//평점 출력
	@Override
	public void replyScoreUpdate(MovieAvgScoreResultVO vo) throws Exception {
		dao.replyScoreUpdate(vo);
	}

	@Override
	public MovieAvgScoreResultVO replyScoreSelect(String movie_num) throws Exception {
		return dao.replyScoreSelect(movie_num);
	}

}
