package arrays_methodinmain;

public class Arrays_MethodInMain {

    public static void main(String[] args) {
        int rikki[] = {29,39,49,59,79,99};
        changeArray(rikki);
        
        for(int A: rikki){
            System.out.println(A);
        }
    }
    
    public static void changeArray(int x[]){
        for(int z=0; z<x.length; z++){
            x[z]+=5;
            
        }
    }

}
