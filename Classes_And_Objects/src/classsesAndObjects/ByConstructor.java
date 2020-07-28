package classsesAndObjects;

public class ByConstructor {
	
	private int studentsNumber;
	private String studentsName;
	
	public ByConstructor(int stdNo, String stdName) {
		studentsNumber = stdNo;
		studentsName = stdName;
	}
	
	public void studentDetails() {
		System.out.println(studentsNumber + " " + studentsName);
	}
}
