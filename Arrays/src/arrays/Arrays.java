package arrays;

public class Arrays {

    public static void main(String[] args) {
        printDaysOfWeek();
    }
    //method to print out days of week using array
    public static void printDaysOfWeek(){
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Days Of The Week are:");
        for(String A: days){
            System.out.println(A);
        }
        System.out.println("------------------------");
    }

}
