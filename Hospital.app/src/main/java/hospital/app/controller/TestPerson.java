package hospital.app.controller;

import hospital.app.dao.imp.PersonDaoImp;
import hosptal.app.dto.Person;

public class TestPerson {
	public static void main(String[] args) {
		
		PersonDaoImp pdi = new PersonDaoImp();
		
		Person per = new Person();
		per.setAge(24);
		per.setEmail("dinga@gmail.com");
		per.setGender("Male");
		per.setName("dinga");
		per.setPhone(9836483934l);
		
	}

}
