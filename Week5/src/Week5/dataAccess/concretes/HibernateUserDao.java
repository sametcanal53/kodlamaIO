package Week5.dataAccess.concretes;

import Week5.dataAccess.abstracts.UserDao;
import Week5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklendi : " + user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silindi : " + user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Sistem bilgisi güncellendi : " + user.getEmail());
		
	}


}
