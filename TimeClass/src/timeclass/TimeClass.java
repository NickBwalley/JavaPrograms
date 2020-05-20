package timeclass;

public class TimeClass {

    public static void main(String[] args) {
        //Time1 time1 = new Time1();
        //time1.setTime();
        Time2 time2 = new Time2();
        time2.setTime(14,34,69);        
        System.out.println(time2.toMillitary());
        System.out.println(time2.toNormal());
        
        Time3 time3 = new Time3();
        time3.setTime(1, 12, 14);
        System.out.println(time3.toMillitary());
        //method to cater for the use entering less than 3outputs instead of giving 
        //3parameters as defined;
        Time4 time4 = new Time4(5,4);
        System.out.println(time4.getTime());
    }

}
