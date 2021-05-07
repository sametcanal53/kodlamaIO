public class Course {
	
	public Course(int id,String courseName, String courseInformation, String courseInstructor , String coursePrice ) {
		_id = id;
		_courseName = courseName;
		_courseInformation = courseInformation;
		_courseInstructor = courseInstructor;
		_coursePrice = coursePrice;
		
	}
	
	private int _id;
	String _courseName;
	String _courseInformation;
	String _courseInstructor;
	String _coursePrice;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}

	
	
}