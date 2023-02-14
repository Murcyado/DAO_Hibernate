package dao;

import java.util.List;

import entities.Category;
import principale.Main;

public class CategoryDAO {

	// méthode pour l'insertion d'une catégorie dans la bd
	public static void addCategory(Category obj) {
		Main.categories.add(obj);
	}

	// méthode qui retourne toutes les catégories de la base
	public static List<Category> listCategories() {
	
		return Main.categories;
	}

	// méthode pour supprimer une catégorie de la bd
	public static void deleteCategory(Category obj) {
		Main.categories.remove(obj);
	}

	// méthode pour mettre à jour une catégorie de la bd
	public static void updateCategory(int idCat, Category newObj) {
		for(Category obj : Main.categories)
		{
			if(obj.getId()==idCat)
			{
				Main.categories.set(Main.categories.indexOf(obj), newObj);
			}
		}
	}

}