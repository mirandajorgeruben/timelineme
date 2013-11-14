package ar.edu.unlam.talleweb.timelineme.services;

import ar.edu.unlam.talleweb.timelineme.model.Persona;
import ar.edu.unlam.talleweb.timelineme.persistence.DaoFactory;
import ar.edu.unlam.talleweb.timelineme.persistence.PersistenceException;
import ar.edu.unlam.talleweb.timelineme.persistence.PersonaDao;




public class PersonaService {

	public Persona findByName(String username) throws PersistenceException {
	
		PersonaDao miPersonaDao = DaoFactory.getPersonaDao();
		return miPersonaDao.findByName(username);
	}

}
