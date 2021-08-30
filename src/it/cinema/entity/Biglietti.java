package it.cinema.entity;

public class Biglietti {

	 private int COD_OPERAZIONE;
	    private String COD_VISITATORE;
	    private String ORA_PROIEZIONE;
	    private String DATA;
	    private String TIPO_PAGAMENTO;
	    private String QUANTITA;
	    private String COD_FILM;
		public int getCOD_OPERAZIONE() {
			return COD_OPERAZIONE;
		}
		public void setCOD_OPERAZIONE(int codOperazione) {
			COD_OPERAZIONE = codOperazione;
		}
		public String getCOD_VISITATORE() {
			return COD_VISITATORE;
		}
		public void setCOD_VISITATORE(String codVisitatore) {
			COD_VISITATORE = codVisitatore;
		}
		public String getORA_PROIEZIONE() {
			return ORA_PROIEZIONE;
		}
		public void setORA_PROIEZIONE(String oraProiezione) {
			ORA_PROIEZIONE = oraProiezione;
		}
		public String getDATA() {
			return DATA;
		}
		public void setDATA(String data) {
			DATA = data;
		}
		public String getTIPO_PAGAMENTO() {
			return TIPO_PAGAMENTO;
		}
		public void setTIPO_PAGAMENTO(String tipoPagamento) {
			TIPO_PAGAMENTO = tipoPagamento;
		}
		public String getQUANTITA() {
			return QUANTITA;
		}
		public void setQUANTITA(String quantita) {
			QUANTITA = quantita;
		}
		public String getCOD_FILM() {
			return COD_FILM;
		}
		public void setCOD_FILM(String codFilm) {
			COD_FILM = codFilm;
		}
		public Biglietti() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Biglietti [COD_OPERAZIONE=" + COD_OPERAZIONE + ", COD_VISITATORE=" + COD_VISITATORE
					+ ", ORA_PROIEZIONE=" + ORA_PROIEZIONE + ", DATA=" + DATA + ", TIPO_PAGAMENTO=" + TIPO_PAGAMENTO
					+ ", QUANTITA=" + QUANTITA + ", COD_FILM=" + COD_FILM + "]";
		}
	    
	    
}
