
/**
 * Beschreiben Sie hier die Klasse SONDERFELD.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SONDERFELD extends FELD
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Object sonderfeld;
    int x;
    int y;
    String farbe;
    int hoehe;
    int breite;
    boolean sichtbar;
    
    public SONDERFELD()
    {
        // Instanzvariable initialisieren
        x = 60;
        y = 60;
        breite = 99;
        hoehe = 99;
        farbe = "braun";
        sichtbar = true;
        
        
        sonderfeld = ZEICHENFLAECHE.SymbolErzeugen(ZEICHENFLAECHE.SymbolArt.rechteck);
        ZEICHENFLAECHE.PositionSetzen(sonderfeld, x, y);
        ZEICHENFLAECHE.GrößeSetzen (sonderfeld,breite, hoehe);
        ZEICHENFLAECHE.FarbeSetzen (sonderfeld, farbe);
        ZEICHENFLAECHE.SichtbarkeitSetzen(sonderfeld, sichtbar);
        
    }
    
    void PositionSetzen (int x, int y)
   {
       this.x = x;
       this.y = y;
       ZEICHENFLAECHE.PositionSetzen(sonderfeld, x, y);
   }
   
   void GroesseSetzen (int breite, int hoehe)
   {
       this.breite = breite;
       this.hoehe = hoehe;
       ZEICHENFLAECHE.GrößeSetzen (sonderfeld, breite, hoehe);
   }
   
   void FarbeSetzen (String farbe)
   {
       this.farbe = farbe;
       ZEICHENFLAECHE.FarbeSetzen(sonderfeld, farbe);
   }
   void SichtbarkeitSetzen (boolean sichtbar)
   {
       this.sichtbar = sichtbar;
       ZEICHENFLAECHE.SichtbarkeitSetzen (sonderfeld, sichtbar);
   }
   
   void NachVornBringen ()
   {
       ZEICHENFLAECHE.NachVornBringen(sonderfeld);
   }
   
   void GanzNachVornBringen()
   {
       ZEICHENFLAECHE.GanzNachVornBringen(sonderfeld);
   }
   
   void NachHintenBringen()
   {
       ZEICHENFLAECHE.NachHintenBringen(sonderfeld);
   }
   
   void GanzNachHintenBringen()
   {
       ZEICHENFLAECHE.GanzNachHintenBringen(sonderfeld);
   }
}
