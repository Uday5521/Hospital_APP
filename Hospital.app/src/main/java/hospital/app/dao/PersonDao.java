package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Encounter;
import hosptal.app.dto.Person;

public interface PersonDao {
	public Person savePerson(Person person);
	public Person getPersonId(int id);
	public List<Encounter> getPersonEncounterByPersonId(int id);
	public List<Person> getPerson();
	public Person updatePErson(Person person,int id);
	public boolean deletePersonById(int id);
	

}
