package Week5;

import Week5.business.abstracts.UserService;
import Week5.business.concretes.UserManager;
import Week5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager();
		User user = new User(1,"Sametcan","AL","sametcanal53@gmail.com","1232325");
		User user2 = new User(2,"Doðukan","BOZKIR","dogukanbozkir@gmail.com","122325");
		userService.register(user);
		userService.register(user2);
		
		userService.registerGoogle(user);
		
		userService.login(user.getEmail(), user.getPassword());
		
	}

}
