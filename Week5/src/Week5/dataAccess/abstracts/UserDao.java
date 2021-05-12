package Week5.dataAccess.abstracts;

import java.util.List;

import Week5.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	
}
