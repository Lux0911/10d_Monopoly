import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
    
/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIEL
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    SPIELBRETT spielbrett;
    SPIELFIGUR gelb;
    SPIELFIGUR blau;
    SPIELFIGUR rot;
    SPIELFIGUR gruen;
    int [] xkoordinaten;
    int [] ykoordinaten;
    public String amzug;
    int aktuellesfeld;
    ZEICHENFLAECHE oberflaeche;
    int zugxkoordinate;
    int zugykoordinate;
    int aktuellesxfeld;
    int aktuellesyfeld;
    int min;
    int max;
    Random random;

    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL() 
    {
        // Instanzvariable initialisieren
        
        spielbrett = new SPIELBRETT();
        gelb = new SPIELFIGUR();
        blau = new SPIELFIGUR();
        rot = new SPIELFIGUR();
        gruen = new SPIELFIGUR();
        
        gelb.FarbeSetzen("gelb");
        blau.FarbeSetzen("blau");
        rot.FarbeSetzen("rot");
        gruen.FarbeSetzen("gruen");
        
        gelb.SichtbarkeitSetzen(true);
        blau.SichtbarkeitSetzen(true);
        rot.SichtbarkeitSetzen(true);
        gruen.SichtbarkeitSetzen(true);
        
        gelb.PositionSetzen (50, 50);
        blau.PositionSetzen (50, 50);
        rot.PositionSetzen (50, 50);
        gruen.PositionSetzen (50, 50);
        
        amzug = "gelb";
        aktuellesfeld = 0;
        
        zugxkoordinate = 0;
        zugykoordinate = 0;
        
        aktuellesxfeld = 0;
        aktuellesyfeld = 0;
        
        
        random = new Random();
        
        xkoordinaten = new int [32];
        ykoordinaten = new int [32];
        final int j = 50;
        final int k = 850;
        min = 2;
        max = 12;
        for (int i = 0; i < 9; i++)
        {
            xkoordinaten [i] = j + 100;
        }
        for (int i = 9; i < 17; i++)
        {
            xkoordinaten [i] = k;
        }
        for (int i = 17; i < 25; i++)
        {
            xkoordinaten [i] = k - 100;
        }
        for (int i = 25; i < 32; i++)
        {
            xkoordinaten [i] = j;
        }
        
        for (int i = 0; i < 9; i++)
        {
            ykoordinaten [i] = j;
        }
        for (int i = 9; i < 17; i++)
        {
            ykoordinaten [i] = j + 100;
        }
        for (int i = 17; i < 25; i++)
        {
            ykoordinaten [i] = k;
        }
        for (int i = 25; i < 32; i++)
        {
            ykoordinaten [i] = k - 100;
        }
        
    }
    
    void main()
    {
        for (int i=0; i < 1000; i++)
        {
            Zug();
            
        }
    }
    void Zug()
    {
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
        zugxkoordinate = xkoordinaten[randomNum + aktuellesxfeld];
        zugykoordinate = ykoordinaten[randomNum + aktuellesyfeld];
        gelb.PositionSetzen (zugxkoordinate,zugykoordinate);
        aktuellesxfeld = randomNum + aktuellesxfeld;
        aktuellesyfeld = randomNum + aktuellesyfeld;
    }
}
