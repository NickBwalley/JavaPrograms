package variablelengtharguments;

public class VariableLengthArguments {

    public static void main(String[] args) {
        System.out.println(getAverage(43,44,45));
    }
    //Method to take Variable Length Arguments 
   public static int getAverage(int... numbers){
       int total = 0; 
    //Enhanced for loop
       for(int z: numbers)
           total+=z;
       return total/numbers.length;
   }

}
