package cat.institutmvm.application.entities;

import java.sql.*;

abstract class Base {
	private String especie, habitat, tempsNavegacio, genere;
	private String horaArribada;
	private float tamany;
	private String vent, nubositat, direccioVent;
	
	public Base(String especie, String habitat, String tempsNavegacio,
			String genere, String horaArribada, float tamany, String vent,
			String nubositat ,String direccioVent) {
		this.setEspecie(especie);
		this.setHabitat(habitat);
		this.setTempsNavegacio(tempsNavegacio);
		this.setGenere(genere);
		this.setHoraArribada(horaArribada);
		this.setTamany(tamany);
		this.setVent(vent);
		this.setNubositat(nubositat);
		this.setDireccioVent(direccioVent);
	}

	
	/** 
	 * Retorna l'especie
	 * 
	 * @return String
	 */
	public String getEspecie() {
		return especie;
	}
	
	/** 
	 * Assigna l'especie
	 * 
	 * @param especie
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	
	/** 
	 * Retorna el habitat
	 * 
	 * @return String
	 */
	public String getHabitat() {
		return habitat;
	}
	
	/** 
	 * Assigna el habitat
	 * 
	 * @param habitat
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	
	/** 
	 * Retorna el temps de navegació
	 * 
	 * @return String
	 */
	public String getTempsNavegacio() {
		return tempsNavegacio;
	}
	
	/** 
	 * Assigna el temps de navegació
	 * 
	 * @param tempsNavegacio
	 */
	public void setTempsNavegacio(String tempsNavegacio) {
		this.tempsNavegacio = tempsNavegacio;
	}

	
	/** 
	 * Retorna el genere
	 * 
	 * @return String
	 */
	public String getGenere() {
		return genere;
	}
	
	/** 
	 * Assigna el genere
	 * 
	 * @param genere
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}

	
	/** 
	 * Retorna l'hora d'arribada
	 * 
	 * @return String
	 */
	public String getHoraArribada() {
		return horaArribada;
	}
	
	/** 
	 * Assigna l'hora d'arribada
	 * 
	 * @param horaArribada
	 */
	public void setHoraArribada(String horaArribada) {
		this.horaArribada = horaArribada;
	}

	
	/** 
	 * Retorna el tamany
	 * 
	 * @return float
	 */
	public float getTamany() {
		return tamany;
	}
	
	/** 
	 * Assigna el tamany
	 * 
	 * @param tamany
	 */
	public void setTamany(float tamany) {
		this.tamany = tamany;
	}

	
	/** 
	 * Retorna el vent
	 * 
	 * @return String
	 */
	public String getVent() {
		return vent;
	}
	
	/** 
	 * Assigna el vent
	 * 
	 * @param vent
	 */
	public void setVent(String vent) {
		this.vent = vent;
	}
	
	
	/** 
	 * Retorna la nubositat
	 * 
	 * @return String
	 */
	public String getNubositat() {
		return nubositat;
	}
	
	/** 
	 * Assigna la nubositat
	 * 
	 * @param nubositat
	 */
	public void setNubositat(String nubositat) {
		this.nubositat = nubositat;
	}

	
	/** 
	 * Retorna la direcció del vent
	 * 
	 * @return String
	 */
	public String getDireccioVent() {
		return direccioVent;
	}
	
	/** 
	 * Assigna la direcció del vent
	 * 
	 * @param direccioVent
	 */
	public void setDireccioVent(String direccioVent) {
		this.direccioVent = direccioVent;
	}
}
