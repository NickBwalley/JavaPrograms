package arrays_multidimensional;

public class Arrays_Multidimensional {

    public static void main(String[] args) {
        int nicky[][] = {{71,73,74,79},{91,93,97,99}};
        int rikki[][] = {{51,52,55,59},{48,43,44,41}};
        displayArray(nicky);
        System.out.println("---------------------");
        displayArray(rikki);
    }
    //method print Multidimensional Array
    public static void displayArray(int x[][]){
        for(int row=0; row<x.length; row++){
            for(int column=0; column<x[row].length; column++){
                System.out.print(x[row][column] + "\t");
        }
            System.out.println("");
        }
    }

}
