package it.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.cinema.dao.BigliettiDAO;
import it.cinema.entity.Biglietti;

@Service
public class BigliettiServiceImpl implements BigliettiService {

	@Autowired
	private BigliettiDAO BigliettiDAO;
	
	@Override
	@Transactional
	public List<Biglietti> getList() {
		return BigliettiDAO.getList();
	}

	@Override
	@Transactional
	public Biglietti getBiglietto(int theCodOperazione) {		
		return BigliettiDAO.getBiglietto(theCodOperazione);
	}

	@Override
	@Transactional
	public void saveBiglietto(Biglietti biglietti) {
		BigliettiDAO.saveBiglietto(biglietti);		
	}
	
	@Override
	@Transactional
	public void deleteBiglietto(int theCodOperazione) {
		BigliettiDAO.deleteBiglietto(theCodOperazione);		
	}
}
