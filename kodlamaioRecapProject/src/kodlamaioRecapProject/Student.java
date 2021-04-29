package kodlamaioRecapProject;

public class Student extends User{

	private String[] registeredCourses;
	private String[] finishedCourses;
	private String[] comments;
	
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public String[] getComments() {
		return comments;
	}
	public void setComments(String[] comments) {
		this.comments = comments;
	}
	public String[] getFinishedCourses() {
		return finishedCourses;
	}

}
