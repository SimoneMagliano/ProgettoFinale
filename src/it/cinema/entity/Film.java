package it.cinema.entity;

public class Film {

		private int COD_FILM;
	    private String TITOLO;
	    private String DATA_INIZIO;
	    private String DATA_FINE;
	    private String PREZZO;
	    private String COD_CINEMA;
		public int getCOD_FILM() {
			return COD_FILM;
		}
		public void setCOD_FILM(int codFilm) {
			COD_FILM = codFilm;
		}
		public String getTITOLO() {
			return TITOLO;
		}
		public void setTITOLO(String titolo) {
			TITOLO = titolo;
		}
		public String getDATA_INIZIO() {
			return DATA_INIZIO;
		}
		public void setDATA_INIZIO(String dataInizio) {
			DATA_INIZIO = dataInizio;
		}
		public String getDATA_FINE() {
			return DATA_FINE;
		}
		public void setDATA_FINE(String dataFine) {
			DATA_FINE = dataFine;
		}
		public String getPREZZO() {
			return PREZZO;
		}
		public void setPREZZO(String prezzo) {
			PREZZO = prezzo;
		}
		public String getCOD_CINEMA() {
			return COD_CINEMA;
		}
		public void setCOD_CINEMA(String codCinema) {
			COD_CINEMA = codCinema;
		}
		public Film() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Film [COD_FILM=" + COD_FILM + ", TITOLO=" + TITOLO + ", DATA_INIZIO=" + DATA_INIZIO + ", DATA_FINE="
					+ DATA_FINE + ", PREZZO=" + PREZZO + ", COD_CINEMA=" + COD_CINEMA + "]";
		}
	    
	    
}
