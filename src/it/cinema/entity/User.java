package it.cinema.entity;

public class User {

	    private String COD_VISITATORE;
	    private String COGNOME;
	    private String NOME;
	    private String TELEFONO;
	    private String EMAIL;
	    private String LOGIN;
	    private String PSW;
	    
		public String getCOD_VISITATORE() {
			return COD_VISITATORE;
		}
		public void setCOD_VISITATORE(String codVisitatore) {
			COD_VISITATORE = codVisitatore;
		}
		public String getCOGNOME() {
			return COGNOME;
		}
		public void setCOGNOME(String cognome) {
			COGNOME = cognome;
		}
		public String getNOME() {
			return NOME;
		}
		public void setNOME(String nome) {
			NOME = nome;
		}
		public String getTELEFONO() {
			return TELEFONO;
		}
		public void setTELEFONO(String telefono) {
			TELEFONO = telefono;
		}
		public String getEMAIL() {
			return EMAIL;
		}
		public void setEMAIL(String email) {
			EMAIL = email;
		}
		public String getLOGIN() {
			return LOGIN;
		}
		public void setLOGIN(String login) {
			LOGIN = login;
		}
		public String getPSW() {
			return PSW;
		}
		public void setPSW(String password) {
			PSW = password;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "User [COD_VISITATORE=" + COD_VISITATORE + ", COGNOME=" + COGNOME + ", NOME=" + NOME + ", TELEFONO="
					+ TELEFONO + ", EMAIL=" + EMAIL + ", LOGIN=" + LOGIN + ", PSW=" + PSW + "]";
		}
		
	    
}
