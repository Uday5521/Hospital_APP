package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Observation;

public interface ObservationDao {
	public Observation createObservation(Observation observation, int id);
	public Observation getObservationById(int id);
	public List<Observation> getAllObservationByEncounterId(int id);
	public Observation updateObservation(Observation observation, int id);
	public boolean deleteObservation(int id); 

}
