package Week3;

public class Student extends User{

	private String registeredCourse;

	public Student(int id, String name, String email, String password,String registeredCourse) {
		super(id, name, email, password);
		this.registeredCourse = registeredCourse;
	}
	
	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
	
}
