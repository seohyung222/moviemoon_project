package com.mycompany.myapp.repository;

import java.util.List;

import com.mycompany.myapp.domain.BookingDTO;
import com.mycompany.myapp.domain.ReservationVO;

public interface ScreeningDAO {
	
	
	//tbl_screening
	public abstract List<String> selectCities(BookingDTO dto) throws Exception;
	
	public abstract List<String> selectDistricts(BookingDTO dto) throws Exception;//복수형으로
	
	public abstract List<String> selectDates(BookingDTO dto) throws Exception;
	
	public abstract List<String> selectTimes(BookingDTO dto) throws Exception;
	
	public abstract List<String> selectSeats(BookingDTO dto) throws Exception;
	
	public abstract List<String> selectTotalSeats(BookingDTO dto) throws Exception;
	
	public abstract void InsertReservation(ReservationVO dto) throws Exception;
	
	public abstract String selectScreeningNum(BookingDTO dto) throws Exception;
	
}
