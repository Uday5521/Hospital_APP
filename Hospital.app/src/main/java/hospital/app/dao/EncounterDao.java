package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Encounter;

public interface EncounterDao {
	public Encounter createEncounter(int id,Encounter encounter);
	public Encounter getEncounterById(int id);
	
	public List<Encounter> getEncounterByBranchesId(int id);
	public List<Encounter> getEncounterByPersonId(int id);
	public Encounter updateEncounter(Encounter encounter,int id);
	public boolean deleteEncounterById(int id);

}
