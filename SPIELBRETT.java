import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Beschreiben Sie hier die Klasse SPIELBRETT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIELBRETT extends RECHTECK 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    JFrame Hintergrund;
    ImageIcon MonopolyHintergrund;
    int x, y;
    
    
    /**
     * Konstruktor für Objekte der Klasse SPIELBRETT
     */
    public SPIELBRETT()
    {
        // Instanzvariable initialisieren
        super();
        x = 0;
        y = 0;
        Hintergrund = new JFrame();
        Hintergrund.setVisible (true);
        Hintergrund.setSize(1000,1000);
        MonopolyHintergrund = new ImageIcon ("Monopoly_Hintergrund.jpg");        
    }

    
}
