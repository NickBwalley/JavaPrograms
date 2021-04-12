package dowhileloop;
//concept to understand is that a doWhile loop guarantees you to do a certain operation at least once
//unlike the while loop which checks the condition before executing a certain operation, a do while loop
//first loops at least once before checking the operation if it is true or false
public class Main {
	public static void main(String[] args) {
		int counter;
		counter = 1;
		do {
			System.out.println(counter);
			counter ++;
		}while(counter < 10);
	}

}
// Do not forget to increase the variable used in the condition, otherwise the loop will never end!