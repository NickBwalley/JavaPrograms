package classsesandobjects;

public class ByMethod {
	int studentsNumber;
	String studentsName;
	
	public void studentDetails(int stdNo, String stdName) {
		studentsNumber = stdNo;
		studentsName = stdName;
	}
	
	public void displayInformation() {
		System.out.println(studentsNumber + " " + studentsName);
	}
}
