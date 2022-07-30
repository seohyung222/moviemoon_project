package com.mycompany.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.BookingDTO;
import com.mycompany.myapp.domain.ReservationVO;
import com.mycompany.myapp.repository.ScreeningDAO;

@Service
public class ScreeningServiceImpl implements ScreeningService {

	@Autowired
	ScreeningDAO dao;

	@Override
	public List<String> getCities(BookingDTO dto) throws Exception {
		
		return dao.selectCities(dto);
	}

	@Override
	public List<String> getDistricts(BookingDTO dto) throws Exception {
		return dao.selectDistricts(dto);
	}

	@Override
	public List<String> getDates(BookingDTO dto) throws Exception {
		return dao.selectDates(dto);
	}

	@Override
	public List<String> getTimes(BookingDTO dto) throws Exception {
		return dao.selectTimes(dto);
	}

	@Override
	public List<String> getSeats(BookingDTO dto) throws Exception {
		return dao.selectSeats(dto);
	}

	@Override
	public List<String> getTotalSeats(BookingDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectTotalSeats(dto);
	}
	
	@Override
	   public void InsertReservation(ReservationVO dto) throws Exception {
	      dao.InsertReservation(dto);
	   }
	
	@Override
	   public String getScreeningNum(BookingDTO dto) throws Exception {
	      return dao.selectScreeningNum(dto);
	   }
}














