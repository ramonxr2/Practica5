package wordleapp;

import java.awt.font.TextLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import wordleapp.ScribbleImports.Canvas;


public class LectorGrafico {
    private Canvas canvas;
    
    public String lecturaPanel(Canvas canvas){
    String input = JOptionPane.showInputDialog("Ingrese su intento", "");
    return input;
    }
    
  public void mensaje(String mensaje){
    JFrame frame = new JFrame("Wordle");
    JOptionPane.showMessageDialog(frame, mensaje);
}
    
}
