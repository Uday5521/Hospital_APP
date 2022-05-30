package hospital.app.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital.app.dao.HospitalDao;
import hospital.app.dao.imp.HospitalDaoImp;
import hosptal.app.dto.Branch;
import hosptal.app.dto.Hospital;


public class BranchService {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = null;
	private HospitalDao hospitalDaoImp = new HospitalDaoImp();
	
	public boolean createBranch(int hospitalId,Branch branch) {
		Hospital hospital = hospitalDaoImp.getHospitalById(hospitalId);
		if(hospital != null) {
			
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			branch.setHospital(hospital);
			entityManager.persist(branch);
			
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
