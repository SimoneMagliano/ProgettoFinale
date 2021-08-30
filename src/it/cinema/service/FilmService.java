package it.cinema.service;

import java.util.List;


import it.cinema.entity.Film;

public interface FilmService {


	public List<Film> getList();
	public void saveFilm(Film theFilm);
	public Film getFilm(int theCodFilm);
	public void deleteFilm(int theCodFilm);
	
}
