package cat.institutmvm.application.entities;


public class Molusc extends Base {
	private int profunditat, temperaturaSuperficial, embarcacions;
	private boolean parasits;

	public Molusc(String especie, String habitat, String tempsNavegacio,
			String genere, String horaArribada, float tamany, String vent, String nubositat,
			String direccioVent, int profunditat, int temperaturaSuperficial, int embarcacions,
			boolean parasits) {
		super(especie, habitat, tempsNavegacio, genere, horaArribada, tamany,
				vent, nubositat, direccioVent);
		this.setProfunditat(profunditat);
		this.setTemperaturaSuperficial(temperaturaSuperficial);
		this.setEmbarcacions(embarcacions);
		this.setParasits(parasits);
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
	 * @return String
	 */
	public String toString() {
		return "Molusc [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", profunditat=" + profunditat + ", temperaturaSuperficial=" + temperaturaSuperficial + ", embarcacions=" + embarcacions + ", parasits=" + parasits + "]";
	}
}
