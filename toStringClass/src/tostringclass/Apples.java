package tostringclass;

public class Apples {
    private String myName;
    private NickFury myBirthDay;
    
    public Apples(String name, NickFury birthday){
        myName = name;
        myBirthDay = birthday;
    }
    
    public String toString(){
        return String.format("My name is %s \t My Birthday is on %s", myName, myBirthDay);
    }
}
