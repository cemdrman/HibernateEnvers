package HibernateEnvers.trainning.dao;

import org.hibernate.Session;

import HibernateEnvers.trainning.model.User;

public class UserDao {
	
	public void saveOrUpdateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
	}

	public void deleteUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
	}
}
