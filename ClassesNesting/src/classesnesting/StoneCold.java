package classesnesting;

public class StoneCold {
    public void stunner(){
        System.out.println("Stone-Cold finisher move is the Stunner!..");
    }
    
    //method to access the nested class
    public void nestedClass(){
        GoldBerg jackHammer = new GoldBerg();
        jackHammer.spear();
    }
    
public class GoldBerg{
    public void spear(){
        System.out.println("Gold-Berg finisher move is the Spear!..");
    }
}

}

