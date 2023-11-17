import java.awt.Graphics;
import java.awt.Color;


public class Eggplant 
{
    public void drawEggplant(Graphics g,int cx,int cy) 
    { 
         g.setColor(new Color(139, 0, 139));
         g.fillOval(cx-30, cy-50, 35, 80);
    }

    
}
