package kodlamaIO;

public class InstructorManager extends UserManager {
public void addToHomework(Instructor instructor) {
	System.out.println("E�itmen "+instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan "+instructor.getHomeworkText()+" �devi eklendi");
}
}
