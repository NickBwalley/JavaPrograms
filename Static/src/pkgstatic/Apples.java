package pkgstatic;

public class Apples {
    private String first;
    private String last;
    private static int members = 0;
    
    public Apples(String f, String l){
        first = f;
        last = l;
        members++;
        System.out.printf("constructor for %s %s.... Iam the %d member of the Club!\n", first, last, members);
    }
}
