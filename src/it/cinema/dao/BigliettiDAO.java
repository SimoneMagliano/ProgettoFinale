package it.cinema.dao;

import java.util.List;

import it.cinema.entity.Biglietti;


public interface BigliettiDAO {

	
		public List<Biglietti> getList();
		public void saveBiglietto(Biglietti theBiglietto);
		public Biglietti getBiglietto(int theCodOperazione);
		public void deleteBiglietto(int theCodOperazione);
		
	}



