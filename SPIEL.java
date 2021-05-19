
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

    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL()
    {
        // Instanzvariable initialisieren
        spielbrett = new SPIELBRETT();
        spielbrett.FarbeSetzen ("grün");
        spielbrett.GroesseSetzen (1000, 1000);
    }

    
}
