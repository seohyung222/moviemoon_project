package com.mycompany.myapp.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.BookingDTO;
import com.mycompany.myapp.domain.ReservationVO;

@Repository
public class ScreeningDAOImpl 
	implements ScreeningDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "com.mycompany.myapp.Screening";
	
	
	@Override
	public List<String> selectCities(BookingDTO dto) {
		return sqlSession.selectList(namespace + ".showcity", dto);	
	}//selectCities

	
	@Override
	public List<String> selectDistricts(BookingDTO dto) {	
		return sqlSession.selectList(namespace + ".showdist", dto);
	}//selectDistricts

	@Override
	public List<String> selectDates(BookingDTO dto) {
		return sqlSession.selectList(namespace + ".showdate", dto);	
	}//selectDates

	@Override
	public List<String> selectTimes(BookingDTO dto) {
		return sqlSession.selectList(namespace + ".showtime", dto);		
	}//selectTimes

	@Override
	public List<String> selectSeats(BookingDTO dto) {	
		return sqlSession.selectList(namespace + ".showseat", dto);		
	}//selectSeats


	@Override
	public List<String> selectTotalSeats(BookingDTO dto) throws Exception {
		return sqlSession.selectList(namespace + ".showtotalseat", dto);	
	}


	@Override
	   public void InsertReservation(ReservationVO dto) throws Exception {
	      sqlSession.insert(namespace + ".InsertReservation" , dto);      
	   }
	
	@Override
	   public String selectScreeningNum(BookingDTO dto) throws Exception {
	      return sqlSession.selectOne(namespace + ".selectScreeningnum", dto);
	   }

	
}//endclass
