package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Hospital;

public interface HospitalDao {
	
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospitalById(int id);
	public Hospital getHospitalBranchsById(int id);
	public List<Hospital> getAllHospital();
	public Hospital updateHospital(Hospital hospital, int id);
	public boolean delteHospitalById(int id);
	
	

}
