import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Object;
    
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
        /** for (int i = 0; i < 9; i++)
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
        */
        xkoordinaten[1] = 50;
        xkoordinaten[2] = 150;
        xkoordinaten[3] = 250;
        xkoordinaten[4] = 350;
        xkoordinaten[5] = 450;
        xkoordinaten[6] = 550;
        xkoordinaten[7] = 650;
        xkoordinaten[8] = 750;
        xkoordinaten[9] = 850;
        xkoordinaten[10] = 850;
        xkoordinaten[11] = 850;
        xkoordinaten[12] = 850;
        xkoordinaten[13] = 850;
        xkoordinaten[14] = 850;
        xkoordinaten[15] = 850;
        xkoordinaten[16] = 850;
        xkoordinaten[17] = 850;
        xkoordinaten[18] = 750;
        xkoordinaten[19] = 650;
        xkoordinaten[20] = 550;
        xkoordinaten[21] = 450;
        xkoordinaten[22] = 350;
        xkoordinaten[23] = 250;
        xkoordinaten[24] = 150;
        xkoordinaten[25] = 50;
        xkoordinaten[26] = 50;
        xkoordinaten[27] = 50;
        xkoordinaten[28] = 50;
        xkoordinaten[29] = 50;
        xkoordinaten[30] = 50;
        xkoordinaten[31] = 50;
        xkoordinaten[32] = 50; 
        ykoordinaten[1] = 50;
        ykoordinaten[2] = 50;
        ykoordinaten[3] = 50;
        ykoordinaten[4] = 50;
        ykoordinaten[5] = 50;
        ykoordinaten[6] = 50;
        ykoordinaten[7] = 50;
        ykoordinaten[8] = 50;
        ykoordinaten[9] = 50;
        ykoordinaten[10] = 150;
        ykoordinaten[11] = 250;
        ykoordinaten[12] = 350;
        ykoordinaten[13] = 450;
        ykoordinaten[14] = 550;
        ykoordinaten[15] = 650;
        ykoordinaten[16] = 750;
        ykoordinaten[17] = 850;
        ykoordinaten[18] = 850;
        ykoordinaten[19] = 850;
        ykoordinaten[20] = 850;
        ykoordinaten[21] = 850;
        ykoordinaten[22] = 850;
        ykoordinaten[23] = 850;
        ykoordinaten[24] = 850;
        ykoordinaten[25] = 850;
        ykoordinaten[26] = 750;
        ykoordinaten[27] = 650;
        ykoordinaten[28] = 550;
        ykoordinaten[29] = 450;
        ykoordinaten[30] = 350;
        ykoordinaten[31] = 250;
        ykoordinaten[32] = 150; 

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

        

        //int randomNum = ThreadLocalRandom.current().nextInt(1, 11 + 1);
        //zugxkoordinate = xkoordinaten[randomNum + aktuellesxfeld];
        //zugykoordinate = ykoordinaten[randomNum + aktuellesyfeld];
        //gelb.PositionSetzen (zugxkoordinate,zugykoordinate);
        //aktuellesxfeld = randomNum + aktuellesxfeld;
        //aktuellesyfeld = randomNum + aktuellesyfeld;
        //randomNum = 0;
        
        Random rand = new Random();

        // Obtain a number between [0 - 10].
        int n = rand.nextInt(10);

        // Add 1 to the result to get a number from the required range
        // (i.e., [2 - 12]).
        n += 2;
        System.out.println("Du hast eine " + n + " gewürfelt");
        zugxkoordinate = xkoordinaten[n + aktuellesxfeld];
        zugykoordinate = ykoordinaten[n + aktuellesyfeld];

        gelb.PositionSetzen (zugxkoordinate,zugykoordinate);
        aktuellesxfeld = n + aktuellesxfeld;
        aktuellesyfeld = n + aktuellesyfeld;
    }
}
