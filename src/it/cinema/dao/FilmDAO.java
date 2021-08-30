package it.cinema.dao;

import java.util.List;


import it.cinema.entity.Film;

public interface FilmDAO {


	public List<Film> getList();
	public void saveFilm(Film theFilm);
	public Film getFilm(int theCodFilm);
	public void deleteFilm(int theCodFilm);
	
}
