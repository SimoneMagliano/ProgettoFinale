package it.cinema.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import it.cinema.entity.Film;

@Repository
public class FilmDAOImpl implements FilmDAO{


		@Autowired 
		private SessionFactory sessionFactory;
		public List<Film> getList() {
			Session currentSession = sessionFactory.getCurrentSession();
				Query<Film> theQuery = 
						currentSession.createQuery("from Film order by codFilm", Film.class);
						List<Film> film = theQuery.getResultList();	
					return film;
		}
		
		@Override
		public void saveFilm(Film theFilm) {
				Session currentSession = sessionFactory.getCurrentSession();
					currentSession.saveOrUpdate(theFilm);
		}
		
		@Override
		public Film getFilm(int theCodFilm) {
				Session currentSession = sessionFactory.getCurrentSession();
				Film theFilm = currentSession.get(Film.class, theCodFilm);
						return theFilm;
		}
		@Override
		public void deleteFilm(int theCodFilm) {
		
			Session currentSession = sessionFactory.getCurrentSession();
				Query theQuery = 
						currentSession.createQuery("delete from Film where codFilm=:codFilm");
						theQuery.setParameter("codFilm", theCodFilm);
						theQuery.executeUpdate();		
		}


	}


