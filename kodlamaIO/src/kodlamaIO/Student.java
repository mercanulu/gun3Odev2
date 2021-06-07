package kodlamaIO;

public class Student extends User {
	private String commentText;
	private int completed = 0;

	
	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

}
