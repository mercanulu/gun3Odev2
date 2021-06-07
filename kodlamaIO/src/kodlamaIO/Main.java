package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		UserManager[] userManagers=new UserManager[] {new StudentManager(),new InstructorManager()};
		User user=new User();
		user.setId(1);
		Student student=new Student();
		student.setId(2);
		Instructor instructor=new Instructor();
		instructor.setId(3);
		
		
	for(UserManager userManager:userManagers) {
		
		userManager.login(user);
		userManager.logOut(instructor);
		userManager.login(student);
		
		}
		StudentManager studentManager=new StudentManager();
		
		student.setId(1);
		student.setFirstName("Mercan");
		student.setLastName("Ulu");
		student.setEmail("mercan@gmail.com");
		student.setPassword("fjsjfdk");
		student.setCommentText("Kurs çok güzel ilerliyor.");
		student.getCompleted();
		studentManager.addToComment(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setHomeworkText("Kodlama.io projesini yazdýðýnýzý düþünelim. User, Instructor, Student nesnelerini modelleyiniz");
		instructorManager.addToHomework(instructor);
		

	}

}
