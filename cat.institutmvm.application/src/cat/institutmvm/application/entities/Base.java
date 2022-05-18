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
	 * @return String
	 */
	public String getEspecie() {
		return especie;
	}
	
	/** 
	 * @param especie
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	
	/** 
	 * @return String
	 */
	public String getHabitat() {
		return habitat;
	}
	
	/** 
	 * @param habitat
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	
	/** 
	 * @return String
	 */
	public String getTempsNavegacio() {
		return tempsNavegacio;
	}
	
	/** 
	 * @param tempsNavegacio
	 */
	public void setTempsNavegacio(String tempsNavegacio) {
		this.tempsNavegacio = tempsNavegacio;
	}

	
	/** 
	 * @return String
	 */
	public String getGenere() {
		return genere;
	}
	
	/** 
	 * @param genere
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}

	
	/** 
	 * @return String
	 */
	public String getHoraArribada() {
		return horaArribada;
	}
	
	/** 
	 * @param horaArribada
	 */
	public void setHoraArribada(String horaArribada) {
		this.horaArribada = horaArribada;
	}

	
	/** 
	 * @return float
	 */
	public float getTamany() {
		return tamany;
	}
	
	/** 
	 * @param tamany
	 */
	public void setTamany(float tamany) {
		this.tamany = tamany;
	}

	
	/** 
	 * @return String
	 */
	public String getVent() {
		return vent;
	}
	
	/** 
	 * @param vent
	 */
	public void setVent(String vent) {
		this.vent = vent;
	}
	
	
	/** 
	 * @return String
	 */
	public String getNubositat() {
		return nubositat;
	}
	
	/** 
	 * @param nubositat
	 */
	public void setNubositat(String nubositat) {
		this.nubositat = nubositat;
	}

	
	/** 
	 * @return String
	 */
	public String getDireccioVent() {
		return direccioVent;
	}
	
	/** 
	 * @param direccioVent
	 */
	public void setDireccioVent(String direccioVent) {
		this.direccioVent = direccioVent;
	}

	public void insertSQL(){};

}
