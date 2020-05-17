
package enumeration;

import java.util.EnumSet;
public class Enumeration {

    public static void main(String[] args) {
        //creating an enhanced forLoop 
        for(mango mangoObj: mango.values())
            System.out.printf("%s--%s--%s\n", mangoObj, mangoObj.getBestHeatSongs(), mangoObj.getnumberOfSongs());
        System.out.println("-----------------------------");
        for(mango applesObj: EnumSet.range(mango.ChrisBrown, mango.EdSheeran))
            System.out.printf("\n%s--%s--%s\n", applesObj, applesObj.getBestHeatSongs(), applesObj.getnumberOfSongs());
    }
    
}
