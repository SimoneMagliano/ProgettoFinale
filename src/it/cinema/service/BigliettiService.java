package it.cinema.service;

import java.util.List;

import it.cinema.entity.Biglietti;


public interface BigliettiService {

	
		public List<Biglietti> getList();
		public void saveBiglietto(Biglietti theBiglietto);
		public Biglietti getBiglietto(int theCodOperazione);
		public void deleteBiglietto(int theCodOperazione);
		
	}



