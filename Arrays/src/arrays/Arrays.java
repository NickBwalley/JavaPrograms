package arrays;

public class Arrays {

    public static void main(String[] args) {
        int nick[] = new int[5];
        nick[0] = 41;
        nick[1] = 79;
        nick[2] = 35;
        nick[3] = 29;
        nick[4] = 42;
        /*This is the first way of how to print elements of an array*/
        //System.out.println(nick[0]);
        //System.out.println(nick[1]);
        //System.out.println(nick[2]);
        //System.out.println(nick[3]);
        //System.out.println(nick[4]);
        
        
        /*This is the second way of printing elements of an array*/
        for(int x=0; x<nick.length; x++){
            System.out.println(nick[x]);
        }
    }

}
