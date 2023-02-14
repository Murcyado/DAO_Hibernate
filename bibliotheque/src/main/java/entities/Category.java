package entities;

public class Category {

	private int id;
	private String titre;
	private int nbLivres;
	
	public Category(int id, String titre, int nbLivres) {
		super();
		this.id = id;
		this.titre = titre;
		this.nbLivres = nbLivres;
	}
	
	
	public Category() {
		
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", titre=" + titre + ", nbLivres=" + nbLivres + "]";
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


	public int getNbLivres() {
		return nbLivres;
	}


	public void setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
	}
}
