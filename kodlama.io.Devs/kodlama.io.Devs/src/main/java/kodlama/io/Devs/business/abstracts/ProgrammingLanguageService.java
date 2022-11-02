package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	List<ProgrammingLanguage> getAll();

	public ProgrammingLanguage getById(int id) ;

	public void add(ProgrammingLanguage language) throws Exception;

	public void delete(ProgrammingLanguage language);

	public void update(ProgrammingLanguage language, int id);
}