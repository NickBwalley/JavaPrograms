package linkedList;
import java.util.LinkedList;
public class Main {
    public static void main(String [] args){
        linkedList();
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
}
