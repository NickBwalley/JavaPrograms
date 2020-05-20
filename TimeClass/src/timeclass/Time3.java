package timeclass;

public class Time3 {
    private int hour = 12;
    private int minute = 00;
    private int second = 00;
    
    //method to setTime
    public void setTime(int hour, int minute, int second){
        //note that you must use the keyword this in order to override the local variable
        //which is described above else it will never be used and instead not overridden
        this.hour = ((hour>=0 && hour<24)? hour: 0);
        this.minute = ((minute>=0 && minute<60)? minute: 0);
        this.second = ((second>=0 && second<60)? second: 0);
        
    }
    //method print time toMillitary format
    public String toMillitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    //method print time toNormal format
    public String toNormal(){
        return String.format("%d:%02d:%02d: %s", ((hour==0 || hour==12)? 12: hour%12), minute, second, (hour<12)?"AM":"PM");
    }
}
