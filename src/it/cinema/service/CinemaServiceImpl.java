package it.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import it.cinema.entity.Cinema;
import it.cinema.dao.CinemaDAO;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaDAO CinemaDAO;
	
	@Override
	@Transactional
	public List<Cinema> getList() {
		return CinemaDAO.getList();
	}

	@Override
	@Transactional
	public Cinema getCinema(int theCodCinema) {		
		return CinemaDAO.getCinema(theCodCinema);
	}

	@Override
	@Transactional
	public void saveCinema(Cinema cinema) {
		CinemaDAO.saveCinema(cinema);		
	}
	
	@Override
	@Transactional
	public void deleteCinema(int theCodCinema) {
		CinemaDAO.deleteCinema(theCodCinema);		
	}
}
