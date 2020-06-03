package variablelengtharguments;

public class VariableLengthArguments {

    public static void main(String[] args) {
        
        int counter = 0;
        int rikki[] = new int[6];
        rikki[0] = 45;
        rikki[1] = 45;
        rikki[2] = 45;
        rikki[3] = 45;
        rikki[4] = 45;
        rikki[5] = 99;
        
        System.out.println(getAverage(rikki));
    }
    //Method to take Variable Length Arguments 
   public static int getAverage(int... numbers){
       int total = 0; 
    //Enhanced for loop
       for(int z: numbers)
           total+=z;
       return total;
   }

}
