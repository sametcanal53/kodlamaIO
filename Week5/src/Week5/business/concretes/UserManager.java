package Week5.business.concretes;


import java.util.regex.Pattern;

import Week5.business.abstracts.UserService;
import Week5.entities.concretes.User;

public class UserManager implements UserService{

	public static final String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$"; // "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	
	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerGoogle() {
		System.out.println();
		
	}

	@Override
	public void register(User user) {

	}
	
}
