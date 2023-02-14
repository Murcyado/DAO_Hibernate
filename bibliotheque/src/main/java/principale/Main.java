package principale;

import java.util.ArrayList;
import java.util.List;

import dao.CategoryDAO;
import entities.Category;

public class Main {

	public static List<Category> categories = new ArrayList<Category>();

	public static void main(String[] args) {
		System.out.println("Welcome to my library");

		// Question 1 : Utiliser le CategoryDAO pour insérer une nouvelle catégorie dans la liste
		// Création d'une nouvelle catégorie
		Category newCategory = new Category(1, "Fiction", 25);
				
		// Insertion de la nouvelle catégorie en utilisant le CategoryDAO
		CategoryDAO.addCategory(newCategory);
		System.out.println(categories);
	}

}
