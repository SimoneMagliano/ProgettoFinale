package it.cinema.dao;

import java.util.List;


import it.cinema.entity.Cinema;

public interface CinemaDAO {


	public List<Cinema> getList();
	public void saveCinema(Cinema theCinema);
	public Cinema getCinema(int theCodCinema);
	public void deleteCinema(int theCodCinema);
	
}


