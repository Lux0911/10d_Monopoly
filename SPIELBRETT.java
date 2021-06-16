 

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
public class SPIELBRETT  
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
    ECKFELD start;
    STRASSE badstrasse;
    STRASSE turmstrasse;
    SONDERFELD einkommenssteuer;
    SONDERFELD suedbahnhof;
    STRASSE chausseestrasse;
    STRASSE elisenstrasse;
    STRASSE poststrasse;
    ECKFELD nzb;
    STRASSE seestrasse;
    STRASSE hafenstrasse;
    STRASSE neuestrasse;
    SONDERFELD westbahnhof;
    STRASSE muenchnerstrasse;
    STRASSE wienerstrasse;
    STRASSE berlinerstrasse;
    ECKFELD fp;
    STRASSE theaterstrasse;
    STRASSE museumstrasse;
    STRASSE opernplatz;
    SONDERFELD nordbahnhof;
    STRASSE lessingstrasse;
    STRASSE schillerstrasse;
    STRASSE goethestrasse;
    ECKFELD idg;
    STRASSE rathausplatz;
    STRASSE hauptstrasse;
    STRASSE bahnhofstrasse;
    SONDERFELD hauptbahnhof;
    STRASSE parkstrasse;
    SONDERFELD zusatzsteuer;
    STRASSE schlossallee;
    int x, y;
    
    public SPIELBRETT()
    {
        start = new ECKFELD();
        badstrasse = new STRASSE();
        turmstrasse = new STRASSE();
        einkommenssteuer = new SONDERFELD();
        suedbahnhof = new SONDERFELD();
        chausseestrasse = new STRASSE();
        elisenstrasse = new STRASSE ();
        poststrasse = new STRASSE ();
        nzb = new ECKFELD ();
        seestrasse = new STRASSE ();
        hafenstrasse = new STRASSE ();
        neuestrasse = new STRASSE ();
        westbahnhof = new SONDERFELD ();
        muenchnerstrasse = new STRASSE ();
        wienerstrasse = new STRASSE ();
        berlinerstrasse = new STRASSE ();
        fp = new ECKFELD ();
        theaterstrasse = new STRASSE ();
        museumstrasse = new STRASSE ();
        opernplatz = new STRASSE ();
        nordbahnhof = new SONDERFELD ();
        lessingstrasse = new STRASSE ();
        schillerstrasse = new STRASSE ();
        goethestrasse = new STRASSE ();
        idg = new ECKFELD ();
        rathausplatz = new STRASSE ();
        hauptstrasse = new STRASSE ();
        bahnhofstrasse = new STRASSE ();
        hauptbahnhof = new SONDERFELD ();
        parkstrasse = new STRASSE ();
        zusatzsteuer = new SONDERFELD ();
        schlossallee = new STRASSE ();
        
        
        
        start.FarbeSetzen("grau");
        badstrasse.FarbeSetzen("braun");
        turmstrasse.FarbeSetzen("braun");
        einkommenssteuer.FarbeSetzen("weiß");
        suedbahnhof.FarbeSetzen ("weiß");
        chausseestrasse.FarbeSetzen("cyan");
        elisenstrasse.FarbeSetzen("cyan");
        poststrasse.FarbeSetzen("cyan");
        nzb.FarbeSetzen("grau");
        seestrasse.FarbeSetzen("magenta");
        hafenstrasse.FarbeSetzen("magenta");
        neuestrasse.FarbeSetzen("magenta");
        westbahnhof.FarbeSetzen("weiß");
        muenchnerstrasse.FarbeSetzen("orange");
        wienerstrasse.FarbeSetzen("orange");
        berlinerstrasse.FarbeSetzen("orange");
        fp.FarbeSetzen("grau");
        theaterstrasse.FarbeSetzen("rot");
        museumstrasse.FarbeSetzen("rot");
        opernplatz.FarbeSetzen("rot");
        nordbahnhof.FarbeSetzen("weiß");
        lessingstrasse.FarbeSetzen("gelb");
        schillerstrasse.FarbeSetzen("gelb");
        goethestrasse.FarbeSetzen("gelb");
        idg.FarbeSetzen("grau");
        rathausplatz.FarbeSetzen("grün");
        hauptstrasse.FarbeSetzen("grün");
        bahnhofstrasse.FarbeSetzen("grün");
        hauptbahnhof.FarbeSetzen("weiß");
        parkstrasse.FarbeSetzen("blau");
        zusatzsteuer.FarbeSetzen("weiß");
        schlossallee.FarbeSetzen("blau");



        
        start.PositionSetzen(0,0);
        badstrasse.PositionSetzen(100, 0);
        turmstrasse.PositionSetzen(200,0);
        einkommenssteuer.PositionSetzen(300,0);
        suedbahnhof.PositionSetzen(400,0);
        chausseestrasse.PositionSetzen(500,0);
        elisenstrasse.PositionSetzen(600,0);
        poststrasse.PositionSetzen (700,0);
        nzb.PositionSetzen (800,0);
        
        
        
                                                                                                                                                                                                                                                                                                                                                                                                                
    }
    
    
}
