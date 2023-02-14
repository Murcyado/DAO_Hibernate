package dao;

import java.util.List;

import entities.Category;
import entities.Livre;
import principale.Main;

public class LivreDAO {
	
		public static void addLivre(Livre obj) {
			Main.livres.add(obj);
		}

		// méthode qui retourne tous les livres de la base
		public static List<Livre> listLivres() {
		
			return Main.livres;
		}
		
		// méthode pour supprimer un livre de la bd
		public static void deleteLivre(Livre obj) {
			Main.livres.remove(obj);
		}

		// méthode pour mettre à jour un livre de la bd
		public static void updateLivre(int idLivre, Livre newObj) {
			for(Livre obj : Main.livres)
			{
				if(obj.getId()==idLivre)
				{
					Main.livres.set(Main.livres.indexOf(obj), newObj);
				}
			}
		}
}
