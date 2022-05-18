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
	 * @return String
	 */
	public String toString() {
		return "Alga [especie=" + getEspecie() + ", habitat=" + getHabitat() + ", tempsNavegacio=" + getTempsNavegacio() + ", genere=" + getGenere() + ", horaArribada=" + getHoraArribada() + ", tamany=" + getTamany() + ", vent=" + getVent() + ", nubositat=" + getNubositat() + ", direccioVent=" + getDireccioVent() + ", profunditat=" + getProfunditat() + ", temperaturaSuperficial=" + getTemperaturaSuperficial() + "]";
	}

}
