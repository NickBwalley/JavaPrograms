package timeclass;
import java.util.Scanner;
public class Time1 {
    Scanner nicky = new Scanner(System.in);
    //defining variables
    private int hour;
    private int minute;
    private int second;
    //method to getUser input timeZone
    public void setTime(){
        System.out.println("Enter Your Time-Zone");
        System.out.println("Enter Hour(24hour): ");
        hour = nicky.nextInt();
        System.out.println("Enter Minute: ");
        minute = nicky.nextInt();
        System.out.println("Enter Seconds: ");
        second = nicky.nextInt();
        
        System.out.print("The Time is: ");
        System.out.print(hour < 24 ? hour: 00);
        System.out.print(":");
        System.out.print(minute < 60 ? minute: 00);
        System.out.print(":");
        System.out.print(second < 60 ? second: 00);
        System.out.print(" Hrs");
    }
}
