package com.mycompany.myapp.repository;

import java.util.List;

import com.mycompany.myapp.domain.MemberReplyJoinResultVO;
import com.mycompany.myapp.domain.MovieAvgScoreResultVO;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;

public interface MovieAvgScoreResultDAO {

	//총 평점 업데이트
	public abstract void replyScoreUpdate(MovieAvgScoreResultVO vo) throws Exception;

	//평점 출력
	public abstract MovieAvgScoreResultVO replyScoreSelect(String movie_num) throws Exception;
}
