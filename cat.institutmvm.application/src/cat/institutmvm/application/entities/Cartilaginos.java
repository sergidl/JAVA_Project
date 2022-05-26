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
	 * Retorna la profunditat
	 * 
	 * @return int
	 */
	public int getProfunditat() {
		return profunditat;
	}

	
	/** 
	 * Assigna la profunditat
	 * 
	 * @param profunditat
	 */
	public void setProfunditat(int profunditat) {
		this.profunditat = profunditat;
	}

	
	/** 
	 * Retorna la temperatura superficial
	 * 
	 * @return int
	 */
	public int getTemperaturaSuperficial() {
		return temperaturaSuperficial;
	}

	
	/** 
	 * Assigna la temperatura superficial
	 * 
	 * @param temperaturaSuperficial
	 */
	public void setTemperaturaSuperficial(int temperaturaSuperficial) {
		this.temperaturaSuperficial = temperaturaSuperficial;
	}

	
	/** 
	 * Retorna el numero d'embarcacions
	 * 
	 * @return int
	 */
	public int getEmbarcacions() {
		return embarcacions;
	}

	
	/** 
	 * Assigna el numero d'embarcacions
	 * 
	 * @param embarcacions
	 */
	public void setEmbarcacions(int embarcacions) {
		this.embarcacions = embarcacions;
	}

	
	/** 
	 * Retorna el numero de hams
	 * 
	 * @return int
	 */
	public int getNumHams() {
		return numHams;
	}

	
	/** 
	 * Assigna el numero de hams
	 * 
	 * @param numHams
	 */
	public void setNumHams(int numHams) {
		this.numHams = numHams;
	}

	
	/** 
	 * Retorna el tipus d'esquer
	 * 
	 * @return String
	 */
	public String getTipusEsquer() {
		return tipusEsquer;
	}

	
	/** 
	 * Assigna el tipus d'esquer
	 * 
	 * @param tipusEsquer
	 */
	public void setTipusEsquer(String tipusEsquer) {
		this.tipusEsquer = tipusEsquer;
	}

	
	/** 
	 * Retorna si es proshark
	 * 
	 * @return boolean
	 */
	public boolean getProshark() {
		return proshark;
	}

	
	/** 
	 * Assigna si es proshark
	 * 
	 * @param proshark
	 */
	public void setProshark(boolean proshark) {
		this.proshark = proshark;
	}

	
	/** 
	 * Retorna si hi ha parasits
	 * 
	 * @return boolean
	 */
	public boolean getParasits() {
		return parasits;
	}

	
	/** 
	 * Assigna si hi ha parasits
	 * 
	 * @param parasits
	 */
	public void setParasits(boolean parasits) {
		this.parasits = parasits;
	}

	
	/** 
	 * Retorna si hi ha precencia de hams
	 * 
	 * @return boolean
	 */
	public boolean getPrecenciaHams() {
		return precenciaHams;
	}

	
	/** 
	 * Assigna si hi ha precencia de hams
	 * 
	 * @param precenciaHams
	 */
	public void setPrecenciaHams(boolean precenciaHams) {
		this.precenciaHams = precenciaHams;
	}

	
	/** 
	 * Retorna una cadena de caràcters amb les dades del cartilaginos
	 * 
	 * @return String
	 */
	public String toString() {
		return "Cartilaginos [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", profunditat=" + getProfunditat() + ", temperaturaSuperficial=" + getTemperaturaSuperficial() + ", embarcacions=" + getEmbarcacions() + ", numHams=" + getNumHams() + ", tipusEsquer=" + getTipusEsquer() + ", proshark=" + getProshark() + ", parasits=" + getParasits() + ", precenciaHams=" + getPrecenciaHams() + "]";
	}
}
