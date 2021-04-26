
public class Student {

	public Student(int id, String studentName, String studentLastName) {
		_id = id;
		_studentName = studentName;
		_studentLastName = studentLastName;
	}

	private int _id;
	String _studentName;
	String _studentLastName;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

}