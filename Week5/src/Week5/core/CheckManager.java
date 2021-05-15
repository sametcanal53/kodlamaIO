package Week5.core;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class CheckManager {

	
	public static boolean passwordCheck(String password) {
		if(password.length() < 6)
			return false;
		else
			return true;
	}
	
	public static boolean emailCheck(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
	
		
		 if (!matcher.matches()) 
			return false;
		else 
			return true;
	
	}
		
	
	public static boolean nameCheck(String name,String lastName) {
		if(name.length()>=2 && lastName.length()>=2)
			return true;
		else
			return false;
	}
	
	
	
}
