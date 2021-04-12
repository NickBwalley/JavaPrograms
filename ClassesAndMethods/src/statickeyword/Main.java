package statickeyword;

public class Main {
	//what does static keyword do in a class
	public static void main(String[] args) {
		//static members belong to the class instead of  a specific instance.
		HelloStatic nick = new HelloStatic();
		HelloStatic.age = 40;
		System.out.println(HelloStatic.age);
		System.out.println(HelloStatic.doSomething("Hello Buddies!")); //accessed via the class 
		System.out.println(nick.doSomethingElse("Hello yeah Buddy!")); // accessed via the instance of a class 
		
		//HelloStatic nick2 = new HelloStatic();
		//HelloStatic nick3 = new HelloStatic();

	}

}
/*NOTE: 
 * doSomething() method is a static method which means it can be accessed by an instance of a class but it will return 
 * an error but it is good practice and recommended that when you declare a method static use the class name to 
 * invoke the method 
 * doSomethingElse() method is not a static method which means it can only be accessed by an instance of a class
 * so this means that when you are trying to access the static method doSomething() you have to access it using the 
 * class name which when you are trying to access the doSomethingElse() method which is a non-static method it means
 * that you will have to use an instance of a class to access the method otherwise it will return a warning message*/
 