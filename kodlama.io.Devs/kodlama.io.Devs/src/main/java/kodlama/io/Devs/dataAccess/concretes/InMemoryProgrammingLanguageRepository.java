package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;
	
	@Autowired
	public InMemoryProgrammingLanguageRepository() {
		
		languages = new ArrayList<ProgrammingLanguage>();
		
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "Java"));
		languages.add(new ProgrammingLanguage(3, "Python"));
	}
	
	
	@Override
	public List<ProgrammingLanguage> getAll() {
	
		for(ProgrammingLanguage programmingLanguage : languages) {
			programmingLanguage.getName();
		}
		return languages;
	}

	
	@Override
	public ProgrammingLanguage getById(int id) {
		
		for(ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	
	@Override
	public void add(ProgrammingLanguage language) {
		languages.add(language);	
	}

	
	@Override
	public void delete(ProgrammingLanguage language) {
	
		for(ProgrammingLanguage language1 :languages) {
			if(language1.getName().equals(language.getName())) {
				languages.remove(1);
			}
		}
	}

	
	@Override
	public void update(ProgrammingLanguage language, int id) {
		
		for(ProgrammingLanguage programmingLanguage :languages) {
			if(programmingLanguage.getId() == id) {
				programmingLanguage.setName(language.getName());
			}
		}
	}
}
