package it.cinema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import it.cinema.entity.Cinema;

@Repository
public class CinemaDAOImpl implements CinemaDAO{


		@Autowired 
		private SessionFactory sessionFactory;
		public List<Cinema> getList() {
			Session currentSession = sessionFactory.getCurrentSession();
				Query<Cinema> theQuery = 
						currentSession.createQuery("from Cinema order by codCinema", Cinema.class);
						List<Cinema> cinema = theQuery.getResultList();	
					return cinema;
		}
		
		@Override
		public void saveCinema(Cinema theCinema) {
				Session currentSession = sessionFactory.getCurrentSession();
					currentSession.saveOrUpdate(theCinema);
		}
		
		@Override
		public Cinema getCinema(int theCodCinema) {
				Session currentSession = sessionFactory.getCurrentSession();
				Cinema theCinema = currentSession.get(Cinema.class, theCodCinema);
						return theCinema;
		}
		@Override
		public void deleteCinema(int theCodCinema) {
		
			Session currentSession = sessionFactory.getCurrentSession();
				Query theQuery = 
						currentSession.createQuery("delete from Cinema where codCinema=:codCinema");
						theQuery.setParameter("codCinema", theCodCinema);
						theQuery.executeUpdate();		
		}


	}


