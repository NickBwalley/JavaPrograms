package tostring;

public class NickFury {
    private int year;
    private int month;
    private int day;
    
    public NickFury(int y, int m, int d){
        year = y;
        month = m;
        day = d;
       //printing the values 
        System.out.printf("The Constructor SetDate is: %s", this);
    }
    
    public String toString(){
        return String.format("%02d-%02d-%02d", year, month, day);
    }
}
