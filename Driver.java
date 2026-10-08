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


public class Driver extends JPanel
{
   private Court board;
   private static JFrame frame;
   private static JLabel header;

   public Driver(JFrame fr)
   {
      header = new JLabel("Volleyball Game");
      header.setFont(new Font("Arial Bold", Font.PLAIN, 40));
      setLayout(new BorderLayout());
   }
   
   public static void main(String[] arg)
   {
      frame = new JFrame("Volleyball");
      frame.setSize(700,1000);
      JPanel panel = new JPanel();
      panel.setBackground(Color.BLACK);
      panel.setLayout(new FlowLayout());
      frame.setLocation(0, 0);
      frame.setContentPane(new Driver(frame));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setVisible(true);
   }

//    public static void main(String[] args) {
//       JFrame frame = new JFrame("Court");
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.setSize(400, 300);
//       JPanel panel = new JPanel();
//       
//       //Customize the panel (Optional)
//       panel.setBackground(Color.LIGHT_GRAY); // Set background color
//       panel.setLayout(new FlowLayout());    // Set layout manager (FlowLayout is default)
//    
//       JLabel label = new JLabel("Welcome to the Panel!");
//       JButton button = new JButton("Click Me");
//       
//       panel.add(label);
//       panel.add(button);
//    
//       frame.add(panel);
//       frame.setVisible(true);
//    }
}