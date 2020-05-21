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
    
    public String toString(){
        return String.format("Sum =: %d", sum);
    }
}
