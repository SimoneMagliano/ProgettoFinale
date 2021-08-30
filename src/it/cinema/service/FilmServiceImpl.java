package it.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import it.cinema.entity.Film;
import it.cinema.dao.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO FilmDAO;
	
	@Override
	@Transactional
	public List<Film> getList() {
		return FilmDAO.getList();
	}

	@Override
	@Transactional
	public Film getFilm(int theCodFilm) {		
		return FilmDAO.getFilm(theCodFilm);
	}

	@Override
	@Transactional
	public void saveFilm(Film film) {
		FilmDAO.saveFilm(film);		
	}
	
	@Override
	@Transactional
	public void deleteFilm(int theCodFilm) {
		FilmDAO.deleteFilm(theCodFilm);		
	}
}
