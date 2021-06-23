
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
    

   SPIELFIGUR()
  {
    super();
    betrag = 0;
    gelbkontostand = 15000;
    blaukontostand = 15000;
    rotkontostand = 15000;
    schwarzkontostand = 15000;
    schwarz = new KREIS();
    farbig = new KREIS();
    schwarz.RadiusSetzen(11);
    farbig.RadiusSetzen(10);
    schwarz.MittelpunktSetzen(50, 50);
    farbig.MittelpunktSetzen(50, 50);
  
    
  }
  void Vorrücken()
  {
     //beim alten Standpunkt verschwinden und beim neuen Standpunkt neu erscheinen 
    }
  
}
