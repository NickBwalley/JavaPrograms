package finalkeyword;

public class Apples {
    private int sum;
    private final int NUMBER;
    
    public Apples(int total){
        NUMBER = total;
    }
    
    public void add(){
        sum+=NUMBER;
    }
    public int returnSum(){
        return sum;
    }
    
    public String toString(){
        return String.format("Sum =: %d", returnSum());
    }
}
