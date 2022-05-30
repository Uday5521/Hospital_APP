package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Branch;
import hosptal.app.dto.Encounter;
import hosptal.app.dto.Hospital;

public interface BranchDao {
	public Branch saveBranch(Branch branch, int id);
	public Branch getBranchById(int id);
	public Hospital getBranchHospitalById(int id);
	public List<Branch> getAllBranch();
	public List<Branch> getHospitalBranches(int id);
	public Encounter getBranchEncounters(int id);
	public Branch updateBranch(Branch branch, int id);
	public boolean deleteBranchById(int id);
}
