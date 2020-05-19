package constructors;

public class Apples {
    private String  girlFriendsName;
    //creating a constructor
    //A constructor is a special method that is invoked when an object is instantiated...
    public Apples(String name){
        girlFriendsName = name;
    }
    
    public void setName(String name){
        girlFriendsName = name;
    }
    
    public String getName(){
        return girlFriendsName;
    }
    
    public void printCrap(){
        System.out.printf("Your first GirlFriend was: %s", getName());
        System.out.println("");
    }
}
