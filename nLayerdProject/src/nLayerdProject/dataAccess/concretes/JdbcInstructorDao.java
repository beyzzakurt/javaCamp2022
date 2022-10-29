package nLayerdProject.dataAccess.concretes;

import nLayerdProject.dataAccess.abstracts.InstructorDao;
import nLayerdProject.entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added to the database with Jdbc: " + instructor.getFirstName() + " " + instructor.getLastName());	
	} 
}
