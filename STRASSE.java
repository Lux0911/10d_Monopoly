
/**
 * Beschreiben Sie hier die Klasse SRASSE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class STRASSE extends FELD
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Object strasse;
    int x;
    int y;
    String farbe;
    int hoehe;
    int breite;
    boolean sichtbar;
    

    /**
     * Konstruktor für Objekte der Klasse SRASSE
     */
    public STRASSE()
    {
        // Instanzvariable initialisieren
        x = 60;
        y = 60;
        breite = 50;
        hoehe = 80;
        farbe = "braun";
        sichtbar = true;
        
        
        strasse = ZEICHENFLAECHE.SymbolErzeugen(ZEICHENFLAECHE.SymbolArt.rechteck);
        ZEICHENFLAECHE.PositionSetzen(strasse, x, y);
        ZEICHENFLAECHE.GrößeSetzen (strasse,breite, hoehe);
        ZEICHENFLAECHE.FarbeSetzen (strasse, farbe);
        ZEICHENFLAECHE.SichtbarkeitSetzen(strasse, sichtbar);
        
    }

   void PositionSetzen (int x, int y)
   {
       this.x = x;
       this.y = y;
       ZEICHENFLAECHE.PositionSetzen(strasse, x, y);
   }
   
   void GroesseSetzen (int breite, int hoehe)
   {
       this.breite = breite;
       this.hoehe = hoehe;
       ZEICHENFLAECHE.GrößeSetzen (strasse, breite, hoehe);
   }
   
   void FarbeSetzen (String farbe)
   {
       this.farbe = farbe;
       ZEICHENFLAECHE.FarbeSetzen(strasse, farbe);
   }
   void SichtbarkeitSetzen (boolean sichtbar)
   {
       this.sichtbar = sichtbar;
       ZEICHENFLAECHE.SichtbarkeitSetzen (strasse, sichtbar);
   }
   
   void NachVornBringen ()
   {
       ZEICHENFLAECHE.NachVornBringen(strasse);
   }
   
   void GanzNachVornBringen()
   {
       ZEICHENFLAECHE.GanzNachVornBringen(strasse);
   }
   
   void NachHintenBringen()
   {
       ZEICHENFLAECHE.NachHintenBringen(strasse);
   }
   
   void GanzNachHintenBringen()
   {
       ZEICHENFLAECHE.GanzNachHintenBringen(strasse);
   }
}
