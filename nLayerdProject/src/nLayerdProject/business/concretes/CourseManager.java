package nLayerdProject.business.concretes;

import java.util.List;

import nLayerdProject.business.abstracts.CourseService;
import nLayerdProject.core.abstracts.Logger;
import nLayerdProject.dataAccess.abstracts.CourseDao;
import nLayerdProject.entities.concretes.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	@Override
	public void add(Course course) throws Exception{
		if(course.getPrice() < 0) 
			throw new Exception("The price of the course cannot be less than 0.");
		
		for(Course course1: courses) {
			if(course1.getName().equals(course.getName()))
				throw new Exception("The course is avaliable. Please enter another course name.");
		}
			
		courseDao.add(course);
		
		for(Logger logger : loggers)
			logger.log(course.getName());
	}
}
