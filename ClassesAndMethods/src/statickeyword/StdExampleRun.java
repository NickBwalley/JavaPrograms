package statickeyword;

public class StdExampleRun {

	public static void main(String[] args) {
		StudentExample nick = new StudentExample();
		//System.out.println(nick.getNoOfStudents()); // NOT THE PREFERED METHOD OF CALLING STATIC METHODS
		StudentExample Jay = new StudentExample();
		StudentExample Cutler = new StudentExample();
		StudentExample Ronnie = new StudentExample();
		StudentExample Coleman = new StudentExample();
		System.out.println(StudentExample.getNoOfStudents());

	}

}
