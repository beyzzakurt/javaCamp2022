package nLayerdProject.business.concretes;

import nLayerdProject.business.abstracts.InstructorService;
import nLayerdProject.core.abstracts.Logger;
import nLayerdProject.dataAccess.abstracts.InstructorDao;
import nLayerdProject.dataAccess.concretes.HibernateInstructorDao;
import nLayerdProject.dataAccess.concretes.JdbcInstructorDao;
import nLayerdProject.entities.concretes.Instructor;

public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger : loggers)
			logger.log(instructor.getFirstName());
	}
}
