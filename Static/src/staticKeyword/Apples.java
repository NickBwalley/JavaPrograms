package staticKeyword;

public class Apples {
    private int first;
    private int last;
    private static int members;
    
    public Apples(int f, int l, int mem){
        first = f;
        last = l;
        members++;
    }
}
