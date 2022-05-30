package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.User;

public interface UserDao {
	public User saveUser(User user);
	public User validateUser(String email,String password);
	public List<User> getAllUser();
	public User getUserById(int id);
	public User updateUser(User user, int id);
	public boolean deleteUserById(int id);

}
