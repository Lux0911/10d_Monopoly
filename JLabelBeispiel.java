import javax.swing.*;
public class JLabelBeispiel
{
    // main-Methode
    public static void main(String[] args)
    {
        // Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("JLabel Beispiel");
        meinJDialog.setSize(975,1100);
 
    
 
        // Wir erstellen ein JLabel mit einem Text und unserem Icon
        // Die horizontale Ausrichtung setzen wir auf "CENTER"
        JLabel label = new JLabel ("Start = +200$", 
             JLabel.CENTER);
 
        // Die vertikale Ausrichtung des JLabels setzen wir auf "TOP"
        label.setVerticalAlignment(JLabel.TOP);
 
        // Die relative Ausrichtung des Textes zum Icon setzen wir auf "LEFT"
        label.setHorizontalTextPosition(JLabel.LEFT);
 
        // Wir fügen das JLabel unserem Dialog hinzu
        meinJDialog.add(label);
 
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);
 
    }
}