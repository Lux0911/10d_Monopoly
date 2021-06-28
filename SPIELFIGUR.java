
/**
 * Beschreiben Sie hier die Klasse SPIELFIGUREN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class SPIELFIGUR extends KREIS
{ 
  public int gelbkontostand;
  public int blaukontostand;
  public int rotkontostand;
  public int schwarzkontostand;
  public int betrag;

  KREIS schwarz;
  KREIS farbig;
  
  int x;
  int y;
  String farbe;  

  SPIELFIGUR()
  {
    super();
    betrag = 0;
    x = 0;
    y = 0;
    farbe = "schwarz";
    gelbkontostand = 15000;
    blaukontostand = 15000;
    rotkontostand = 15000;
    schwarzkontostand = 15000;
    schwarz = new KREIS();
    farbig = new KREIS();
    schwarz.RadiusSetzen(11);
    farbig.RadiusSetzen(10);
    schwarz.FarbeSetzen("schwarz");
    
    
    
    schwarz.MittelpunktSetzen(x, y);
    farbig.MittelpunktSetzen(x, y);
  
    
  }
  void PositionSetzen(int x, int y)
  {
      schwarz.MittelpunktSetzen(x, y);
      farbig.MittelpunktSetzen (x, y);
  }
  void FarbeSetzen (String farbe)
  {
      farbig.FarbeSetzen(farbe);
  }
  void Vorrücken()
  {
     //beim alten Standpunkt verschwinden und beim neuen Standpunkt neu erscheinen 
    }
  
}
