
/**
 * Beschreiben Sie hier die Klasse SPIELBRETT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIELBRETT extends RECHTECK
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    SPIELBRETT spielbrett;

    /**
     * Konstruktor für Objekte der Klasse SPIELBRETT
     */
    public SPIELBRETT()
    {
        // Instanzvariable initialisieren
        spielbrett = new SPIELBRETT();
        spielbrett.FarbeSetzen ("grau");
        spielbrett.GroesseSetzen (100, 100);
        spielbrett.SichtbarkeitSetzen (true);
    }

    
}
