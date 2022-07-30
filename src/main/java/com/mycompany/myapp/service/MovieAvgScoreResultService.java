package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.domain.MovieAvgScoreResultVO;

public interface MovieAvgScoreResultService {

	//총 평점 업데이트
	public abstract void replyScoreUpdate(MovieAvgScoreResultVO vo) throws Exception;


	//총 평점 출력
	public abstract MovieAvgScoreResultVO replyScoreSelect(String movie_num) throws Exception;
}  //interface
