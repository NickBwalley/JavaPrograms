
package enumeration;

public enum mango {
    ChrisBrown("tooslie", "100songs"),
    SiaChandelier("CheapThrills", "110songs"),
    NickyMinaj("PeelsNPortions", "200songs"),
    CardiB("Money", "95songs"),
    EdSheeran("Stormzy", "150songs"),
    BurnaBoy("OnTheLow", "100songs");
    
    private final String bestHeatSong;
    private final String numberOfSongs;
    
    mango(String bSong, String NoSongs){
        bestHeatSong = bSong;
        numberOfSongs = NoSongs;
    }
    
    public String getBestHeatSongs(){
        return bestHeatSong;
    }
    public String getnumberOfSongs(){
        return numberOfSongs;
    }
    
}
