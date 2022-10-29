package nLayerdProject.business.concretes;

import java.util.List;

import nLayerdProject.business.abstracts.CategoryService;
import nLayerdProject.core.abstracts.Logger;
import nLayerdProject.dataAccess.abstracts.CategoryDao;
import nLayerdProject.entities.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	
	@Override
	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if(category1.getName().equals(category.getName())) 
				throw new Exception("This category is available. Please enter another category name.");
		}
		categoryDao.add(category);
		
		for(Logger logger: loggers) 
			logger.log(category.getName());
	}
}
