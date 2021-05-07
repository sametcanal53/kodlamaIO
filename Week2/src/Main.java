
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi(C# + ANGULAR)",
				"2 ay surecek ucretsiz ve profesyonel bir programla, sifirdan yazilim gelistirme ogreniyoruz.",
				"Engin Demirog", "Ucretsiz");
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi(JAVA + REACT)",
				"2 ay surecek ucretsiz ve profesyonel bir programla, sifirdan yazilim gelistirme ogreniyoruz.",
				"Engin Demirog", "Ucretsiz");
		Course course3 = new Course(3, "Programlamaya Giris Icin Temel Kurs",
				"PYTHON,JAVA,C# gibi tum programlama dilleri icin temel programlama mantigini anlasilir.",
				"Engin Demirog", "Ucretsiz");

		Student student1 = new Student(1, "Sametcan", "AL");
		Student student2 = new Student(2, "Sametcan", "AL");

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.getId() + "-" + course._courseName + "\n" + course._courseInformation + "\n"
					+ course._courseInstructor + " - " + course._coursePrice);
			System.out.println();
		}

		System.out.println("---------------------------------------");

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course2);
		courseManager.removeToCourse(course3);

		System.out.println("---------------------------------------");
		Student[] students = { student1, student2 };
		for (Student student : students) {
			System.out.println(student.getId() + " - " + student._studentName + " " + student._studentLastName);

		}
		System.out.println("---------------------------------------");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.removeStudent(student2);
		studentManager.updateStudent(student2);
	}

}
