package Week3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Sametcan","sametcanal53@gmail.com","1234","Yazilim");
		StudentManager studentManager = new StudentManager();
		
		Instructor instructor = new Instructor(2,"Engin","Demirog","12345", "Yazilim Gelistirici Yetistirme Kampi" );
		InstructorManager instructorManager = new InstructorManager();

		studentManager.SýgnUp(student);
		studentManager.SignIn(student);
		System.out.println("\nOgrenci Bilgileri ;  \nAdý = " + student.getName() + "\nE-Mail Adresi = " + student.getEmail() +"\nKayit Oldugu Kurs = "+student.getRegisteredCourse());
		
		System.out.println();
		instructorManager.addToCourse(instructor);
		instructorManager.deleteToCourse(instructor);
		instructorManager.updateToCourse(instructor);
		
		System.out.println("\nEgitmenin Bilgileri ; \nAdý = " + instructor.getName() +"\nE-Mail Adresi = "+instructor.getEmail()+"\nSisteme Ekledigi Kurs = "+instructor.getCourse());
		
	}

}
