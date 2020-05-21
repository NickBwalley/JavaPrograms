package tostringclass;

public class NickFury {
    private int year;
    private int month;
    private int day;
    
    public NickFury(int y, int m, int d){
        year = y;
        month  = m;
        day = d;
        
            System.out.printf("The Date is %s\n", this);
    }
    
    public String toString(){
        return String.format("%02d/%02d/%02d", year, month, day);
    }
}
