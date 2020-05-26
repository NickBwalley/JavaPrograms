package dsa_practice;

public class DSA_Practice {

    public static void main(String[] args) {
    String daysOfWeeks [] = new String[7];
    daysOfWeeks[0] = "Monday";
    daysOfWeeks[1] = "Tuesday";
    daysOfWeeks[2] = "Wednesday";
    daysOfWeeks[3] = "Thurday";
    daysOfWeeks[4] = "Friday";
    daysOfWeeks[5] = "Saturday";
    daysOfWeeks[6] = "Sunday";
    
    for(int i = 0; i < daysOfWeeks.length; i++){
        System.out.println(daysOfWeeks[i]);
    }
    
    LargestNumber maximum = new LargestNumber();
    maximum.printArray();
    
   }

}
