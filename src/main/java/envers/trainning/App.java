package envers.trainning;

import envers.trainning.dao.UserDao;
import envers.trainning.model.User;

public class App {
	public static void main(String[] args) {
		User user = new User(1, "cem", "dırman", "cem@bilisim.io", "1231231212");
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
