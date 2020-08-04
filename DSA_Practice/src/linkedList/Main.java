package linkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        //linkedList();
        int [] sampleArray = {49,12,49,14,79,99,71,12,10,94,71};
        duplicates(sampleArray);

    }
    
    // linked list to store the temperature reading for n number of elements
    public static void linkedList(){
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("mouse");
        animals.add("cow");
        animals.add("goat");
        
        System.out.print(animals + " ");
    }
    
    public static List<Integer> duplicates (int a []) {
	List<Integer> list = new ArrayList<Integer>();
	//We loop up to size <a.length-1 since if are at 
	//i = a.length-1 and we are checking i+1, we will get an error
	//i.e. ArrayIndexOutOfBounds exception 
	for (int i = 0; i < a.length-1 ; i++) {
		if (a[i] == a[i+1]) {
			list.add(a[i]);
		}
	}		
	return list;
    }
}
