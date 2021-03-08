package returnmethodusingprintf;

public class NickFury {
    String girlFriendsName;
   
    public void setName(String name){
    girlFriendsName = name;
   }
   
   public String getName(){
       return girlFriendsName;
   }
   
   public void printCrap(){
       System.out.printf("Your First GirlFriends Name was %s", getName());
   }     
   
}
