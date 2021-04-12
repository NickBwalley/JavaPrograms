package classesnesting;

public class Main {

    public static void main(String[] args) {
        getNested1();//firstWay
        getNested2(); //secondWay
    }
    
    public static void getNested1(){
        //first way to access nestedClasses 
        //1. Creating an object inside the class then accessing it 
        StoneCold nicky = new StoneCold();
        nicky.stunner();
        nicky.nestedClass();
    }
    
    public static void getNested2(){
        //second way to access nestedClass
        //1.create an object of the outer class
        //2.Access the inner class and create an object using the outer objects class-Object
        StoneCold nick = new StoneCold();
        StoneCold.GoldBerg bwalley = nick.new GoldBerg();
        nick.stunner();
        bwalley.spear();
    }

}
