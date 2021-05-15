package Week5.dataAccess.concretes;

import java.util.List;

import Week5.dataAccess.abstracts.UserDao;
import Week5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Doðrulama linki  " + user.getEmail() + " adresine gönderilmiþtir.");
		System.out.println("Sisteme yeni kayýt yapýldý ; \nAdý = " + user.getName() + "\nSoyadý = " + user.getLastName()
				+ "\nE-Mail = " + user.getEmail() + "\n");
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silindi : " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("Sistem bilgisi güncellendi : " + user.getEmail());

	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
