package enumerations;

public enum Mango {
    Avogadros("6.023*10^-23"),
    radius("3.142"),
    nickys("79.99*10^-19");
    
    private final String constants;
    
    Mango(String constant){
        constants = constant;
    }
    
    public String getConst(){
        return constants;
    }
}
