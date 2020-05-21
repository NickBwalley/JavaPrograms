package enumerations;

public class Enumerations {

    public static void main(String[] args) {
        for(Apples apples: Apples.values())
            System.out.printf("%s\t%s\t%s\n", apples, apples.getDesc(), apples.getYear() );
    }

}
