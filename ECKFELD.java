
/**
 * Beschreiben Sie hier die Klasse ECKFELD.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ECKFELD extends FELD
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Object eckfeld;
    int x;
    int y;
    String farbe;
    int hoehe;
    int breite;
    boolean sichtbar;
    
    public ECKFELD()
    {
        // Instanzvariable initialisieren
        x = 60;
        y = 60;
        breite = 99;
        hoehe = 99;
        farbe = "braun";
        sichtbar = true;
        
        
        eckfeld = ZEICHENFLAECHE.SymbolErzeugen(ZEICHENFLAECHE.SymbolArt.rechteck);
        ZEICHENFLAECHE.PositionSetzen(eckfeld, x, y);
        ZEICHENFLAECHE.GrößeSetzen (eckfeld,breite, hoehe);
        ZEICHENFLAECHE.FarbeSetzen (eckfeld, farbe);
        ZEICHENFLAECHE.SichtbarkeitSetzen(eckfeld, sichtbar);
        
    }
    
    void PositionSetzen (int x, int y)
   {
       this.x = x;
       this.y = y;
       ZEICHENFLAECHE.PositionSetzen(eckfeld, x, y);
   }
   
   void GroesseSetzen (int breite, int hoehe)
   {
       this.breite = breite;
       this.hoehe = hoehe;
       ZEICHENFLAECHE.GrößeSetzen (eckfeld, breite, hoehe);
   }
   
   void FarbeSetzen (String farbe)
   {
       this.farbe = farbe;
       ZEICHENFLAECHE.FarbeSetzen(eckfeld, farbe);
   }
   void SichtbarkeitSetzen (boolean sichtbar)
   {
       this.sichtbar = sichtbar;
       ZEICHENFLAECHE.SichtbarkeitSetzen (eckfeld, sichtbar);
   }
   
   void NachVornBringen ()
   {
       ZEICHENFLAECHE.NachVornBringen(eckfeld);
   }
   
   void GanzNachVornBringen()
   {
       ZEICHENFLAECHE.GanzNachVornBringen(eckfeld);
   }
   
   void NachHintenBringen()
   {
       ZEICHENFLAECHE.NachHintenBringen(eckfeld);
   }
   
   void GanzNachHintenBringen()
   {
       ZEICHENFLAECHE.GanzNachHintenBringen(eckfeld);
   }
   
   void Bezahlen()
   {
       
   }
}
