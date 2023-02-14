package entities;

import java.util.List;

import java.time.LocalDate;
import principale.Main;

public class Livre {

	private int id;
	private String titre;
	private double prix;
	private LocalDate dateEdition;
	private int idCat;
	
	public Livre(int id, String titre, double prix, LocalDate dateEdition, int idCat) {
		super();
		this.id = id;
		this.titre = titre;
		this.prix = prix;
		this.dateEdition = dateEdition;
		this.idCat = idCat;
	}

	public Livre() {
		
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", prix=" + prix + ", dateEdition=" + dateEdition + ", idCat="
				+ idCat + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public LocalDate getDateEdition() {
		return dateEdition;
	}


	public void setDateEdition(LocalDate dateEdition) {
		this.dateEdition = dateEdition;
	}


	public int getIdCat() {
		return idCat;
	}


	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	
	
	
}
