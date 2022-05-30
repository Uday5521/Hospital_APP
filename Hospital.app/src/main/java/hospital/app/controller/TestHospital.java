package hospital.app.controller;

import hospital.app.dao.HospitalDao;
import hospital.app.dao.imp.HospitalDaoImp;
import hosptal.app.dto.Hospital;

public class TestHospital {
public static void main(String[] args) {
	HospitalDaoImp hdi = new HospitalDaoImp();
	Hospital h = new Hospital();
	h.setName("apollo");
	h.setGstno("Gst30545");
	h.setRegistration("Government");
	
	hdi.saveHospital(h);
}
}
