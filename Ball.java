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


public class Ball
{
   int x = 0;
   int y = 0;
   
   public Ball()
   {
      x = 0;
      y = 0;
      
   }
   
   public Ball(int h, int v)
   {
      x = h;
      y = v;
   }
   
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   //Returns the original value
   public int setX(int h)
   {
      int temp = x;
      x = h;
      return temp;
   }
   
   public int setY(int v)
   {
      int temp = y;
      y = v;
      return temp;
   }

}