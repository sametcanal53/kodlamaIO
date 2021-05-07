package Week3;

public class Instructor extends User{

	private String course;

	public Instructor(int id, String name, String email, String password,String course) {
		super(id, name, email, password);
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
}
