package envers.training;

import envers.training.dao.UserDao;
import envers.training.model.User;

public class App {
	public static void main(String[] args) {
		User user = new User("cem", "dirman", "cem@bilisim.io", "1231231212");
		UserDao dao = new UserDao();
		dao.saveOrUpdateUser(user);
		user.setEmail("cem.dirman@bilisim.io");
		dao.saveOrUpdateUser(user);
		user.setName("CEM");
		user.setSurname("DIRMAN");
		dao.saveOrUpdateUser(user);
		dao.deleteUser(user);
	}
}
