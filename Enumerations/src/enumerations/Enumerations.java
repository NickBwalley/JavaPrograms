package enumerations;
import java.util.EnumSet;
public class Enumerations {

    public static void main(String[] args) {
        for(Apples apples: Apples.values())
            System.out.printf("%s\t%s\t%s\n", apples, apples.getDesc(), apples.getYear() );
        System.out.println("-------------------------------");
        for(Mango mango: Mango.values())
            System.out.printf("%s\t\t%s\n", mango, mango.getConst());
        
        for(Apples apples: EnumSet.range(Apples.Enid, Apples.Ivy))
            System.out.printf("%s\t%s\t%s\n", apples, apples.getDesc(), apples.getYear());
    }

}
