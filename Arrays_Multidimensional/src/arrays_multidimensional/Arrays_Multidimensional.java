package arrays_multidimensional;

public class Arrays_Multidimensional {

    public static void main(String[] args) {
        int Apples[][] = {{11,12,13,14}, {21,22,23,24}};
        int Mango[][] = {{31,32,33,34}, {41,42,43,44}};
        
        printArray(Apples);
        System.out.println("-----------------------------------");
        printArray(Mango);
        System.out.println("***********************************");
        NickFury nick = new NickFury();
        nick.getInput();
        
    }
    //method to print out the multi-dimensional Array
    public static void printArray(int x[][]){
        for(int row=0; row<x.length; row++){
            for(int column=0; column<x[row].length; column++){
                System.out.print(x[row][column]+ "\t");
            }
            System.out.println();
        }
    }
    

}
