package classes_nesting;

public class Classes_Nesting {

    public static void main(String[] args) {
        getNested1();        
    }
    
    public static void getNested1(){
        //first way to access nestedClasses 
        //1. Creating an object inside the class then accessing it 
        StoneCold nicky = new StoneCold();
        nicky.stunner();
        nicky.nestedClass();
    }
    
    public static void getNested2(){
        
    }

}
