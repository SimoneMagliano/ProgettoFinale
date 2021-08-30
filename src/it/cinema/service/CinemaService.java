package it.cinema.service;

import java.util.List;


import it.cinema.entity.Cinema;

public interface CinemaService {


	public List<Cinema> getList();
	public void saveCinema(Cinema theCinema);
	public Cinema getCinema(int theCodCinema);
	public void deleteCinema(int theCodCinema);
	
}


