package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	
	public ProgrammingLanguage getById(int id);
	
	void add(ProgrammingLanguage language);
	
	void delete(ProgrammingLanguage language);
	
	void update(ProgrammingLanguage language, int id);
}
