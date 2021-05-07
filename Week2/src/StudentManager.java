
public class StudentManager {
	
    public void addStudent(Student student){
        System.out.println(student._studentName + " was added to course.");
    }
    
    public void removeStudent(Student student){
        System.out.println(student._studentName + " was removed to course.");
    }
    public void updateStudent(Student student) {
    	System.out.println(student._studentName + " was updated to course.");
    }
}