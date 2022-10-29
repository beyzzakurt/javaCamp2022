package nLayerdProject;

import java.util.ArrayList;
import java.util.List;

import nLayerdProject.business.concretes.CategoryManager;
import nLayerdProject.business.concretes.CourseManager;
import nLayerdProject.business.concretes.InstructorManager;
import nLayerdProject.core.abstracts.Logger;
import nLayerdProject.core.concretes.DatabaseLogger;
import nLayerdProject.core.concretes.EmailLogger;
import nLayerdProject.core.concretes.FileLogger;
import nLayerdProject.dataAccess.concretes.HibernateCategoryDao;
import nLayerdProject.dataAccess.concretes.HibernateCourseDao;
import nLayerdProject.dataAccess.concretes.JdbcInstructorDao;
import nLayerdProject.entities.concretes.Category;
import nLayerdProject.entities.concretes.Course;
import nLayerdProject.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		Course course1 = new Course("Software Developer Training Camp", 1, 0, "The new address for midweek entertainment");
		List<Course> courses = new ArrayList<>();
		
		Category category = new Category("Object Oriented Programming", 2);
		List<Category> categories = new ArrayList<>();
		
		Instructor instructor = new Instructor("Engin", "Demiroğ", 3);
		
		Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers); 
		
		courseManager.add(course1);
		categoryManager.add(category);
		instructorManager.add(instructor);
	}
}
