    
/**
 * Wrapperklasse für ein Rechteck auf der Zeichenfläche.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class RECHTECK
{
    /** x-Position der linken oberen Ecke. */
    private int x;
    /** y-Position der linken oberen Ecke. */
    private int y;
    /** Breite des Rechtecks. */
    private int breite;
    /** Höhe des Rechtecks. */
    private int höhe;
    /** Farbe des Rechtecks. */
    private String farbe;
    /** Sichtbarkeit des Rechtecks. */
    private boolean sichtbar;
    /** Drehwinkel des Rechtecks in Grad. */
    private int winkel;
    /** Referenz auf das Delegate-Objekt. */
    private Object symbol;

    RECHTECK rechteck;


    /**
     * Der Konstruktor erzeugt das Delegate-Objekt
     */
    RECHTECK ()
    {
        rechteck = new RECHTECK();
        x = 10;
        y = 10;
        breite = 100;
        höhe = 100;
        farbe = "rot";
        sichtbar = true;
        winkel = 0;
    }
    
    /**
     * Setzt die Position (der linken oberen Ecke) des Rechtecks.
     * @param x x-Position der linken oberen Ecke
     * @param y y-Position der linken oberen Ecke
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        
    }
        
    /**
     * Setzt die Größe des Rechtecks.
     * @param breite (neue) Breite
     * @param hoehe (neue) Höhe
     */
    void GroesseSetzen (int breite, int hoehe)
    {
        this.breite = breite;
        this.höhe = hoehe;
        
    }
    
    /**
     * Setzt die Farbe des Rechtecks.
     * Erlaubte Farben sind:
     * "weiß", "weiss", "rot", "grün", "gruen", "blau", "gelb",
     * "magenta", "cyan", "hellgelb", "hellgrün", "hellgruen",
     * "orange", "braun", "grau", "schwarz"
     * Alle anderen Eingaben werden auf die Farbe schwarz abgebildet.
     * @param farbe (neue) Farbe
     */
    void FarbeSetzen (String farbe)
    {
        this.farbe = farbe;
        
    }
        
    /**
     * Setzt den Drehwinkel des Rechtecks.
     * Die Winkelangabe ist in Grad,positive Werte drehen im Uhrzeigersinn,
     * negative Werte drehen gegen den Uhrzeigersinn.
     * @param winkel der (neue) Drehwinkel des Rechtecks
     */
    void WinkelSetzen (int winkel)
    {
        this.winkel = winkel;
        
    }
    
    /**
     * Schaltet die Sichtbarkeit des Rechtecks ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Rechtecks
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        
    }
    
    
}
