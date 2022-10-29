package nLayerdProject.dataAccess.concretes;

import nLayerdProject.dataAccess.abstracts.CourseDao;
import nLayerdProject.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Added to the database with Hibernate: " + course.getName());
	}
}
