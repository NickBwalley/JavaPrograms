package tostring;

public class NickFury {
    private int year;
    private int month;
    private int day;
    
    public NickFury(){
        this(1,1,1999);
    }
    public NickFury(int y){
        this(y,1,1999);
    }
    public NickFury(int y, int m){
        this(y,m,1999);
    }    
    public NickFury(int y, int m, int d){
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    public void setYear(int y){
        year = ((y>=1970 && y<2020)? y: 2020);
    }
    public void setMonth(int m){
        month = ((m>=1 && m<12)? m: 1);
    }
    public void setDay(int d){
        day =((d>=1 && d<32)? d: 1);
    }
    
}
