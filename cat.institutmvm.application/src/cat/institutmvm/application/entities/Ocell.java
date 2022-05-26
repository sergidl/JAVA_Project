package cat.institutmvm.application.entities;


public class Ocell extends Base {
	private int embarcacions;
	private boolean parasits;

	public Ocell(String especie, String habitat, String tempsNavegacio,
			String genere, String horaArribada, float tamany, String vent,
			String nubositat, String direccioVent, int embarcacions, boolean parasits) {
		super(especie, habitat, tempsNavegacio, genere, horaArribada, tamany,
				vent, nubositat, direccioVent);
		this.setEmbarcacions(embarcacions);
		this.setParasits(parasits);
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
	 * Retorna una cadena de caràcters amb les dades de l'ocell
	 * 
	 * @return String
	 */
	public String toString() {
		return "Ocell [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", embarcacions=" + getEmbarcacions() + ", parasits=" + getParasits() + "]";
	}
}