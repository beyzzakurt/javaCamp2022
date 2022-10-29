package nLayerdProject.dataAccess.concretes;

import nLayerdProject.dataAccess.abstracts.CategoryDao;
import nLayerdProject.entities.concretes.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Added to the database with Jdbc: " + category.getName());
	}
}
