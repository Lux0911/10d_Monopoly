
/**
 * Beschreiben Sie hier die Klasse SPIELFIGUREN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class SPIELFIGUR extends KREIS
{ 
    SPIELFIGUR gelb;
    SPIELFIGUR blau;
    SPIELFIGUR rot;
    SPIELFIGUR schwarz;
    
    

   SPIELFIGUR()
  {
    super();
    gelb.RadiusSetzen(7);
    blau.RadiusSetzen(7);
    rot.RadiusSetzen(7);
    schwarz.RadiusSetzen(7);
    
    gelb = new SPIELFIGUR();
    blau = new SPIELFIGUR();
    rot = new SPIELFIGUR();
    schwarz = new SPIELFIGUR();
    
    gelb.FarbeSetzen("gelb");
    blau.FarbeSetzen ("blau");
    rot.FarbeSetzen("rot");
    schwarz.FarbeSetzen("schwarz");
  
  
    
  }
  void Vorrücken()
  {
     //beim alten Standpunkt verschwinden und beim neuen Standpunkt neu erscheinen 
    }
}
