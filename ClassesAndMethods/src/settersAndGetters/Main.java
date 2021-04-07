package settersAndGetters;

public class Main {

	public static void main(String[] args) {
		Student Nick = new Student();
		Nick.setId(79);
		Nick.setAge(20);
		Nick.setName("Nick");
		System.out.println("Your Name is: " + Nick.getName() + "\nYou are " + Nick.getAge() + " Years Old! \n" + "ID NO: " + Nick.getId());
		System.out.println("\n");
		Student Tom = new Student();
		Tom.setId(49);
		Tom.setAge(19);
		Tom.setName("Tom");
		System.out.println("Your Name is: " + Tom.getName() + "\nYou are " + Tom.getAge() + " Years Old! \n" + "ID NO: " + Tom.getId());
		

	}

}
/*
 * What is encapsulation: is the mechanism that binds together code and the data it manipulates, and keeps it
 * both safe from outside interference and misuse
 * What is Abstraction: is the general concept formed by extracting common features from specific examples 
 * or the act of withdrawing or removing something unnecessary*/
 