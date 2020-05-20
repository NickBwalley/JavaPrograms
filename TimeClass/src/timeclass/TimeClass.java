package timeclass;

public class TimeClass {

    public static void main(String[] args) {
        //Time1 time1 = new Time1();
        //time1.setTime();
        Time2 time2 = new Time2();
        time2.setTime(14,34,69);        
        System.out.println(time2.toMillitary());
        System.out.println(time2.toNormal());
    }

}
