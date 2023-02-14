package dao;

import java.util.List;

import entities.Category;

public class CategoryDAO {
	
	//Méthode pour l'insertion d'une catégorie dans la BD
	public static void addCategory(Category obj) 
	{
		//...
	}
	
	// méthode retournant toutes les catégories de la base
	public static List<Category> listCategories() 
	{
		//...
		List<Category> categories = null;
		//...
		return categories;
	}
	
	//Méthode pour la suppression d'une catégorie dans la BD
	public static void deleteCategory(Category obj) 
	{
		//code pour la suppression
	}
	
	//Méthode pour la mise à jour d'une catégorie dans la BD
		public static void updateCategory(int idCat,Category newObj) 
		{
			//code pour la mise à jour
		}
	
}
