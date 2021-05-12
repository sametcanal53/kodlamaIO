package Week5.business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import Week5.business.abstracts.UserService;

import Week5.core.CheckManager;
import Week5.core.GoogleAdapter;
import Week5.core.GoogleServiceAdapter;
import Week5.dataAccess.concretes.HibernateUserDao;
import Week5.entities.concretes.User;

public class UserManager implements UserService {

	GoogleServiceAdapter googleServiceAdapter = new GoogleAdapter();
	HibernateUserDao hibernateUserDao = new HibernateUserDao();
	ArrayList<String> emailList = new ArrayList<String>();

	@Override
	public void login(String email, String password) {
		System.out.println("Giriş Yapıldı : " + email);

	}

	@Override
	public void registerGoogle(User user) {
		googleServiceAdapter.registerGoogle(user.getEmail(), user.getPassword());

	}

	@Override
	public void register(User user) {
		if (!(CheckManager.passwordCheck(user.getPassword()))) {
			System.out.println("Parola en az 6 karakter oluşmalıdır.");
			return;
		}
		if (!(CheckManager.emailCheck(user.getEmail()))) {
			System.out.println("E-Mail Formatı Hatalı");
			return;
		}

		if (!(CheckManager.nameCheck(user.getName(), user.getLastName()))) {
			System.out.println("Isım ve Soyisim en az 2 karakter olmalıdır");
			return;
		}

		hibernateUserDao.add(user);

	}
	
}
