
/**
 * Beschreiben Sie hier die Klasse SPIEL.
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
    SPIELFIGUR schwarz;

    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL()
    {
        // Instanzvariable initialisieren
        spielbrett = new SPIELBRETT();
        spielbrett.FarbeSetzen ("grün");
        spielbrett.GroesseSetzen (1000, 1000);
        
        gelb = new SPIELFIGUR();
        blau = new SPIELFIGUR();
        rot = new SPIELFIGUR();
        schwarz = new SPIELFIGUR();
        
        gelb.RadiusSetzen(7);
        blau.RadiusSetzen(7);
        rot.RadiusSetzen(7);
        schwarz.RadiusSetzen(7);
    
        
    
        gelb.FarbeSetzen("gelb");
        blau.FarbeSetzen ("blau");
        rot.FarbeSetzen("rot");
        schwarz.FarbeSetzen("schwarz");
    }

    
}
