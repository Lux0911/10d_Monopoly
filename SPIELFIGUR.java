
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
    gelb.RadiusSetzen(10);
    blau.RadiusSetzen(10);
    rot.RadiusSetzen(10);
    schwarz.RadiusSetzen(10);
    
    gelb = new SPIELFIGUR();
    blau = new SPIELFIGUR();
    rot = new SPIELFIGUR();
    schwarz = new SPIELFIGUR();
    
    gelb.FarbeSetzen("gelb");
    blau.FarbeSetzen ("blau");
    rot.FarbeSetzen("rot");
    schwarz.FarbeSetzen("schwarz");
  
  
    
  }
}
