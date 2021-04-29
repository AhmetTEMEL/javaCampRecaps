package kodlamaioRecapProject;

public class InstructorManager {
	
	Instructor instructor;
	
	public InstructorManager(Instructor instructor) {
		this.instructor=instructor;
	}

	public void startEducation() {}
	
	public void finishCourse() {}
	
	public String[] listCourses() {
		return instructor.getContinuingEducations();
	}
}
