package accessModifiers;

public class Main {

	public static void main(String[] args) {
		/*Student.name = "Nick";	 // defined statically
		Student stu = new Student();
		System.out.println(stu.age = 40); 	// defined non-statically
		*/
		Student stud = new Student();
		stud.setName("Nicholas Bwalley");
		System.out.println(stud.getName());
		stud.setAge(20);
		System.out.println(stud.getAge());
		System.out.println("-------");
	}

}
/*
 * ACCESS LEVELS
 * MODIFIER		CLASS 		PACKAGE		SUBCLASS		WORLD
 * Public		Y			Y			Y				Y
 * Protected	Y			Y			Y				N
 * Private 		Y			N			N				N
 * No Modifier	Y			Y			N				N
 * */		
