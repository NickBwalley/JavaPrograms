package pkgstatic;

public class Static {

    public static void main(String[] args) {
        Apples apples = new Apples("Nick", "Bwalley");
        Apples apples1 = new Apples("Megan", "Fox");
        Apples apples2 = new Apples("Sasha", "Banks");
        Apples apples3 = new Apples("Charlotte", "Flair");
        
        System.out.println("**************");
        
        System.out.println(apples1.getFirst());
        System.out.println(apples1.getSecond());
        System.out.println(apples1.getMember());
        
    }
    /*In Java, static keyword is mainly used for memory management. 
    It can be used with variables, methods, blocks and nested classes. 
    It is a keyword which is used to share the same variable or method of a given class. 
    Basically, static is used for a constant variable or a method that is same 
    for every instance of a class.*/

}
