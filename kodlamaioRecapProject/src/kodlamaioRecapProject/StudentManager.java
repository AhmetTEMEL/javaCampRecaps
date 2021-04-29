package kodlamaioRecapProject;

public class StudentManager {
	
	Student student;
	
	public StudentManager(Student student) {
		this.student=student;
	}

	public void updateProfile() {
		
	}
	
	public String[] listCourses() {
		return student.getRegisteredCourses();
	}
	
	public void joinToCoruse() {
		
	}
	
	public void comment() {
		
	}
	

}
