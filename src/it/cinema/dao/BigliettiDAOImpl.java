package it.cinema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.cinema.entity.Biglietti;

@Repository
public class BigliettiDAOImpl implements BigliettiDAO{


		@Autowired 
		private SessionFactory sessionFactory;
		public List<Biglietti> getList() {
			Session currentSession = sessionFactory.getCurrentSession();
				Query<Biglietti> theQuery = 
						currentSession.createQuery("from Biglietti order by codOperazione", Biglietti.class);
						List<Biglietti> biglietto = theQuery.getResultList();	
					return biglietto;
		}
		
		@Override
		public void saveBiglietto(Biglietti theBiglietti) {
				Session currentSession = sessionFactory.getCurrentSession();
					currentSession.saveOrUpdate(theBiglietti);
		}
		
		@Override
		public Biglietti getBiglietto(int theCodOperazione) {
				Session currentSession = sessionFactory.getCurrentSession();
					Biglietti theBiglietto = currentSession.get(Biglietti.class, theCodOperazione);
						return theBiglietto;
		}
		@Override
		public void deleteBiglietto(int theCodOperazione) {
		
			Session currentSession = sessionFactory.getCurrentSession();
				Query theQuery = 
						currentSession.createQuery("delete from Biglietti where codOperazione=:codOperazione");
						theQuery.setParameter("codOperazione", theCodOperazione);
						theQuery.executeUpdate();		
		}


	}


