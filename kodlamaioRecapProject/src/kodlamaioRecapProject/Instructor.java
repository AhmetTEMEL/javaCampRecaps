package kodlamaioRecapProject;

public class Instructor extends User{

	private String[] continuingEducations;
	private String[] futureEducations;
	private String[] passedEducations;
	private String[] certificates;
	private String[] rollCall;
	
	public String[] getContinuingEducations() {
		return continuingEducations;
	}
	public void setContinuingEducations(String[] continuingEducations) {
		this.continuingEducations = continuingEducations;
	}
	public String[] getFutureEducations() {
		return futureEducations;
	}
	public void setFutureEducations(String[] futureEducations) {
		this.futureEducations = futureEducations;
	}
	public String[] getPassedEducations() {
		return passedEducations;
	}
	public String[] getCertificates() {
		return certificates;
	}
	public String[] getRollCall() {
		return rollCall;
	}
}
