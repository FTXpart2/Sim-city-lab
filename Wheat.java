import java.awt.Graphics;
import java.awt.Color;

public class Wheat
{
    public void drawWheat(Graphics g,int cx,int cy) 
    { 
      g.setColor(new Color(150, 150, 0));
      g.fillOval(cx-30, cy-50, 30, 80);
      g.setColor(new Color(165, 165, 0));
      g.fillOval(cx-20, cy-35, 10, 40);
    }
}
