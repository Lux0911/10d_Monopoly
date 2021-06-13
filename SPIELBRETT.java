 

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.net.*;
import java.net.URL;
import java.io.*;
import javax.imageio.ImageIO;
import java.net.JarURLConnection;
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
import java.io.InputStream; 
import java.net.JarURLConnection; 
import java.net.URL; 

import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
/**
 * Beschreiben Sie hier die Klasse SPIELBRETT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SPIELBRETT extends ZEICHENFLAECHE 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    /**JFrame Hintergrund;
    ImageIcon MonopolyHintergrund;
    JLabel l;
    int x, y;
    
    
    
    
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
        l = new JLabel (MonopolyHintergrund);
        l.setLocation(x,y);
        Hintergrund.add(l);
        
    } */
    
    STRASSE strasse1;
    STRASSE strasse2;
    STRASSE strasse3;
    STRASSE strasse4;
    
    public SPIELBRETT()
    {
        strasse1= new STRASSE();
        strasse2 = new STRASSE();
        strasse3 = new STRASSE();
        strasse4 = new STRASSE ();
        
        strasse1.FarbeSetzen("braun");
        strasse2.FarbeSetzen("braun");
        strasse3.FarbeSetzen("hellblau");
        strasse4.FarbeSetzen("hellblau");
        
        strasse1.PositionSetzen(80, 0);
        strasse2.PositionSetzen(130,0);
        strasse3.PositionSetzen(280,0);
        strasse4.PositionSetzen(330,0);
    }
    
    
}
