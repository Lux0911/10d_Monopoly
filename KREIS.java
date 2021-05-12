
/**
 * Wrapperklasse für einen Kreis auf der Zeichenfläche.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class KREIS 
{
    /** x-Position des Kreismittelpunktes. */
    private int x;
    /** y-Position des Kreismittelpunktes. */
    private int y;
    /** Radius des Kreises. */
    private int radius;
    /** Farbe des Kreises. */
    private String farbe;
    /** Sichtbarkeit des Kreises. */
    private boolean sichtbar;
    /** Drehwinkel des Kreises in Grad. */
    private int winkel;
    /** Referenz auf das Delegate-Objekt. */
    private Object symbol;

    /**
     * Der Konstruktor erzeugt das Delegate-Objekt
     */
    KREIS ()
    {
        x = 60;
        y = 60;
        radius = 50;
        farbe = "rot";
        sichtbar = true;
        winkel = 0;
        symbol = SPIELBRETT.SymbolErzeugen(SPIELBRETT.SymbolArt.kreis);
        SPIELBRETT.PositionSetzen(symbol, x - radius, y - radius);
        SPIELBRETT.GrößeSetzen(symbol, radius * 2, radius * 2);
        SPIELBRETT.FarbeSetzen(symbol, farbe);
        SPIELBRETT.SichtbarkeitSetzen(symbol, sichtbar);
        SPIELBRETT.WinkelSetzen(symbol, winkel);
    }
    
    /**
     * Setzt die Position (des Mittelpunkts) des Kreises.
     * @param x x-Position des Mittelpunkts
     * @param y y-Position des Mittelpunkts
     */
    void MittelpunktSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        SPIELBRETT.PositionSetzen(symbol, x - radius, y - radius);
    }
        
    /**
     * Setzt den Radius des Kreises.
     * @param radius (neuer) Radius
     */
    void RadiusSetzen (int radius)
    {
        this.radius = radius;
        SPIELBRETT.GrößeSetzen(symbol, radius * 2, radius * 2);
        SPIELBRETT.PositionSetzen(symbol, x - radius, y - radius);
    }
    
    /**
     * Setzt die Farbe des Kreises.
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
        SPIELBRETT.FarbeSetzen(symbol, farbe);
    }
        
    /**
     * Setzt den Drehwinkel des Kreises.
     * Die Winkelangabe ist in Grad,positive Werte drehen im Uhrzeigersinn,
     * negative Werte drehen gegen den Uhrzeigersinn.
     * @param winkel der (neue) Drehwinkel des Kreises
     */
    void WinkelSetzen (int winkel)
    {
        this.winkel = winkel;
        SPIELBRETT.WinkelSetzen(symbol, winkel);
    }
    
    /**
     * Schaltet die Sichtbarkeit des Kreises ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Kreises
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        SPIELBRETT.SichtbarkeitSetzen(symbol, sichtbar);
    }
    
    /**
     * Bringt den Kreis eine Ebene nach vorn.
     */
    void NachVornBringen ()
    {
       SPIELBRETT.NachVornBringen(symbol);
    }
    
    /**
     * Bringt den Kreis in die vorderste Ebene.
     */
    void GanzNachVornBringen ()
    {
        SPIELBRETT.GanzNachVornBringen(symbol);
    }
    
    /**
     * Bringt den Kreis eine Ebene nach hinten.
     */
    void NachHintenBringen ()
    {
        SPIELBRETT.NachHintenBringen(symbol);
    }
    
    /**
     * Bringt den Kreis in die hinterste Ebene.
     */
    void GanzNachHintenBringen ()
    {
        SPIELBRETT.GanzNachHintenBringen(symbol);
    }
}
