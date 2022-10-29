package nLayerdProject.dataAccess.concretes;

import nLayerdProject.dataAccess.abstracts.CategoryDao;
import nLayerdProject.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Added to the database with Hibernate: " + category.getName());
	}
}
