package polymorphism1;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------");
       //Food nicky = new Food();
        Food rice = new Rice();
        Food beans = new Beans();
        //nicky.eat();
        rice.eat();
        beans.eat();
        System.out.println("---------------------------");
        //Food nicky2 = new Food();
        //nicky2.digest(rice);
        //nicky2.digest(beans);
        digest(rice);
        digest(beans);
    }
    
        public static void digest(Food x){
        x.eat();
    }

}

