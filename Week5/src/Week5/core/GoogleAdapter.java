package Week5.core;

import Week5.GoogleRegister.GoogleRegister;

public class GoogleAdapter implements GoogleServiceAdapter{

	@Override
	public void registerGoogle(String email, String password) {
		GoogleRegister googleRegister = new GoogleRegister();
		googleRegister.register(email, password);
		
	}

	
}
