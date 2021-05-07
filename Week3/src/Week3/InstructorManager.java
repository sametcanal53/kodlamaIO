package Week3;

public class InstructorManager extends UserManager {

	void addToCourse(Instructor instructor) {
		System.out.println("Sisteme Kurs Eklendi." + instructor.getCourse());
	}

	void deleteToCourse(Instructor instructor) {
		System.out.println("Sistemden kurs silindi. "  + instructor.getCourse());
	}

	void updateToCourse(Instructor instructor) {
		System.out.println("Kurs bilgisi duzenlendi. "  + instructor.getCourse());
	}

}
