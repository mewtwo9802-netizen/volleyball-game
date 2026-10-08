import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; 


public class Court extends JPanel
{
   private static JFrame frame;
   
   public Court(JFrame f){
      frame = f;
      setLayout(new GridLayout(6, 5, 10, 10));
      setBackground(new Color(225, 225, 225));
   }
}