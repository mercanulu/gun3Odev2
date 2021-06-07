package kodlamaIO;

public class InstructorManager extends UserManager {
public void addToHomework(Instructor instructor) {
	System.out.println("Eðitmen "+instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan "+instructor.getHomeworkText()+" ödevi eklendi");
}
}
