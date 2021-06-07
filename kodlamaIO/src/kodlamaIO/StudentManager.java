package kodlamaIO;

public class StudentManager extends UserManager {
	public void editToProfile(Student student) {
		System.out.println(student.getId()+"numaral� ��renci " + student.getFirstName()+student.getLastName()+"  profilini d�zenledi.");
	}

	public void disconnect(Student student) {
		System.out.println(student.getId()+"numaral� ��renci " +student.getFirstName()+student.getLastName()+ " ba�lant�s�n� kopard�.");
	}

	public void addToComment(Student student) {
		System.out.println(student.getId()+" numaral� ��renci"+" "+ student.getFirstName()+" "+student.getLastName()+" yorum yapt�: "+student.getCommentText());
	}

	public void removeToComment(Student student) {
		System.out.println(student.getId()+" numaral� ��renci "+ student.getFirstName()+student.getLastName()+student.getCommentText()+" yorumunu sildi");
	}

	public void updateToComment(Student student) {
		System.out.println(student.getId()+" numaral� ��renci "+ student.getFirstName()+student.getLastName()+"yorumunu g�ncelledi: "+student.getCommentText());
		
	}
	public int completedToCourse(Student student) {
		return student.getCompleted();
	}
}
