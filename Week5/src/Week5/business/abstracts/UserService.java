package Week5.business.abstracts;


import Week5.entities.concretes.User;

public interface UserService {
	
	void login(String email,String password);
	void registerGoogle(User user);
	void register(User user);
	
}
