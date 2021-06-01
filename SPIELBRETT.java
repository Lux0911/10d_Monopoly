 

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
public class SPIELBRETT extends JFrame 
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
        URL url = getClass().getResource("/images/Monopoly_Hintergrund.jpg");
        Image img = new ImageIcon(url).getImage();  
        
    }

    private ImageIcon showImg()
    {
        BufferedImage img = null;
        try 
        {
            img = ImageIO.read(getClass().getResource("/images/Monopoly_Hintergrund.jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return new ImageIcon(img);
    }
    
    public static void main(String[] args)
    {
        new SPIELBRETT();
    }
}
