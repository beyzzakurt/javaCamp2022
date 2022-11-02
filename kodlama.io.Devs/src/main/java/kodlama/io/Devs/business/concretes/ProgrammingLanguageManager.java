package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}
	
	
	@Override
	public ProgrammingLanguage getById(int id) {
		
		return programmingLanguageRepository.getById(id);
	}

	
	@Override
	public void add(ProgrammingLanguage language) throws Exception {
		if(isLanguageEmpty(language.getName())) {
			throw new Exception ("The programming language cannot be empty.");
		}
		else if(isLanguageExist(language.getName())) {
			throw new Exception("This programming language is available. Please enter another name.");
		} else {
			programmingLanguageRepository.add(language);
		}
	}


	private boolean isLanguageEmpty(String language) {
		if(language == null || language.isEmpty()) {
			return true;
		}
		return false;
	}

	
	private boolean isLanguageExist(String language) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getName().equals(language)) {
				System.out.println("This programming language is available.");
				return true;
			}
		}
		return false;
	}

	
	@Override
	public void delete(ProgrammingLanguage language) {
		programmingLanguageRepository.delete(language);
	}

	
	@Override
	public void update(ProgrammingLanguage language, int id) {
		programmingLanguageRepository.update(language, id);
	}
}
