package it.cinema.entity;

public class Cinema {

	 private int COD_CINEMA;
	    private String NOME;
	    private String INDIRIZZO;
	    private String CITTA;
	    private String PROVINCIA;
	    private String TELEFONO;
	    private String CAPIENZA;
	    
		public int getCOD_CINEMA() {
			return COD_CINEMA;
		}
		public void setCOD_CINEMA(int codCinema) {
			COD_CINEMA = codCinema;
		}
		public String getNOME() {
			return NOME;
		}
		public void setNOME(String nome) {
			NOME = nome;
		}
		public String getINDIRIZZO() {
			return INDIRIZZO;
		}
		public void setINDIRIZZO(String indirizzo) {
			INDIRIZZO = indirizzo;
		}
		public String getCITTA() {
			return CITTA;
		}
		public void setCITTA(String citta) {
			CITTA = citta;
		}
		public String getPROVINCIA() {
			return PROVINCIA;
		}
		public void setPROVINCIA(String provincia) {
			PROVINCIA = provincia;
		}
		public String getTELEFONO() {
			return TELEFONO;
		}
		public void setTELEFONO(String telefono) {
			TELEFONO = telefono;
		}
		public String getCAPIENZA() {
			return CAPIENZA;
		}
		public void setCAPIENZA(String capienza) {
			CAPIENZA = capienza;
		}
		public Cinema() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Cinema [COD_CINEMA=" + COD_CINEMA + ", NOME=" + NOME + ", INDIRIZZO=" + INDIRIZZO + ", CITTA="
					+ CITTA + ", PROVINCIA=" + PROVINCIA + ", TELEFONO=" + TELEFONO + ", CAPIENZA=" + CAPIENZA + "]";
		}

	    
}
