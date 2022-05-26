package cat.institutmvm.application.entities;


public class Alga extends Base {
	private int profunditat, temperaturaSuperficial;


	public Alga (String especie, String habitat, String tempsNavegacio,
			String genere, String horaArribada, float tamany, String vent, String nubositat,
			String direccioVent, int profunditat, int temperaturaSuperficial) {
		super(especie, habitat, tempsNavegacio, genere, horaArribada, tamany,
		vent, nubositat, direccioVent);
		this.setProfunditat(profunditat);
		this.setTemperaturaSuperficial(temperaturaSuperficial);
	}

	
	/** 
	 * Retorna la profunditat de l'algà
	 * 
	 * @return int
	 */
	public int getProfunditat() {
		return profunditat;
	}
	
	/** 
	 * Assigna la profunditat de l'algà
	 * 
	 * @param profunditat
	 */
	public void setProfunditat(int profunditat) {
		this.profunditat = profunditat;
	}

	
	/** 
	 * Retorna la temperatura superficial de l'algà
	 * 
	 * @return int
	 */
	public int getTemperaturaSuperficial() {
		return temperaturaSuperficial;
	}
	
	/** 
	 * Assigna la temperatura superficial de l'algà
	 * 
	 * @param temperaturaSuperficial
	 */
	public void setTemperaturaSuperficial(int temperaturaSuperficial) {
		this.temperaturaSuperficial = temperaturaSuperficial;
	}

	
	/** 
	 * Retorna una cadena de caràcters amb les dades de l'algà
	 * 
	 * @return String
	 */
	public String toString() {
		return "Alga [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", profunditat=" + getProfunditat() + ", temperaturaSuperficial=" + getTemperaturaSuperficial() + "]";
	}

}
