    
/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIEL
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    ZEICHENFLAECHE fenster;
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
        
        fenster = new ZEICHENFLAECHE();
        gelb = new SPIELFIGUR();
        blau = new SPIELFIGUR();
        rot = new SPIELFIGUR();
        schwarz = new SPIELFIGUR();
        
        gelb.RadiusSetzen(20);
        blau.RadiusSetzen(20);
        rot.RadiusSetzen(20);
        schwarz.RadiusSetzen(20);
    
        
    
        gelb.FarbeSetzen("gelb");
        blau.FarbeSetzen ("blau");
        rot.FarbeSetzen("rot");
        schwarz.FarbeSetzen("schwarz");
    }

    void Zug()
    {
        
    }
}
