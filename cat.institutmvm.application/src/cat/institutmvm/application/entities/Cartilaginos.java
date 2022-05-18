package cat.institutmvm.application.entities;


public class Cartilaginos extends Base {
	private int profunditat, temperaturaSuperficial, embarcacions, numHams;
	private String tipusEsquer;
	private boolean proshark, parasits, precenciaHams;

	public Cartilaginos(String especie, String habitat, String tempsNavegacio,
			String genere, String horaArribada, float tamany, String vent, String nubositat,
			String direccioVent, int profunditat, int temperaturaSuperficial, int embarcacions,
			String tipusEsquer, boolean proshark, boolean parasits, boolean precenciaHams,
			int numHams) {
		super(especie, habitat, tempsNavegacio, genere, horaArribada, tamany,
				vent, nubositat, direccioVent);
		this.setProfunditat(profunditat);
		this.setTemperaturaSuperficial(temperaturaSuperficial);
		this.setEmbarcacions(embarcacions);
		this.setNumHams(numHams);
		this.setTipusEsquer(tipusEsquer);
		this.setProshark(proshark);
		this.setParasits(parasits);
		this.setPrecenciaHams(precenciaHams);
	}

	
	/** 
	 * @return int
	 */
	public int getProfunditat() {
		return profunditat;
	}

	
	/** 
	 * @param profunditat
	 */
	public void setProfunditat(int profunditat) {
		this.profunditat = profunditat;
	}

	
	/** 
	 * @return int
	 */
	public int getTemperaturaSuperficial() {
		return temperaturaSuperficial;
	}

	
	/** 
	 * @param temperaturaSuperficial
	 */
	public void setTemperaturaSuperficial(int temperaturaSuperficial) {
		this.temperaturaSuperficial = temperaturaSuperficial;
	}

	
	/** 
	 * @return int
	 */
	public int getEmbarcacions() {
		return embarcacions;
	}

	
	/** 
	 * @param embarcacions
	 */
	public void setEmbarcacions(int embarcacions) {
		this.embarcacions = embarcacions;
	}

	
	/** 
	 * @return int
	 */
	public int getNumHams() {
		return numHams;
	}

	
	/** 
	 * @param numHams
	 */
	public void setNumHams(int numHams) {
		this.numHams = numHams;
	}

	
	/** 
	 * @return String
	 */
	public String getTipusEsquer() {
		return tipusEsquer;
	}

	
	/** 
	 * @param tipusEsquer
	 */
	public void setTipusEsquer(String tipusEsquer) {
		this.tipusEsquer = tipusEsquer;
	}

	
	/** 
	 * @return boolean
	 */
	public boolean getProshark() {
		return proshark;
	}

	
	/** 
	 * @param proshark
	 */
	public void setProshark(boolean proshark) {
		this.proshark = proshark;
	}

	
	/** 
	 * @return boolean
	 */
	public boolean getParasits() {
		return parasits;
	}

	
	/** 
	 * @param parasits
	 */
	public void setParasits(boolean parasits) {
		this.parasits = parasits;
	}

	
	/** 
	 * @return boolean
	 */
	public boolean getPrecenciaHams() {
		return precenciaHams;
	}

	
	/** 
	 * @param precenciaHams
	 */
	public void setPrecenciaHams(boolean precenciaHams) {
		this.precenciaHams = precenciaHams;
	}

	
	/** 
	 * @return String
	 */
	public String toString() {
		return "Cartilaginos [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", profunditat=" + getProfunditat() + ", temperaturaSuperficial=" + getTemperaturaSuperficial() + ", embarcacions=" + getEmbarcacions() + ", numHams=" + getNumHams() + ", tipusEsquer=" + getTipusEsquer() + ", proshark=" + getProshark() + ", parasits=" + getParasits() + ", precenciaHams=" + getPrecenciaHams() + "]";
	}
}
