package hospital.app.controller;

import hospital.app.dao.BranchDao;
import hospital.app.dao.imp.BranchDaoImp;
import hosptal.app.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("Brach 1 ");
		branch.setPhone(1234);
		branch.setEmail("branch@gmail.com");
		
		BranchDaoImp branchDao = new BranchDaoImp();
		branchDao.updateBranch(branch, 3);
		
	}
}
