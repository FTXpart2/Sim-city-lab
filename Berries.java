
import java.awt.Graphics;
import java.awt.Color;

public class Berries
{
    public void drawBerries(Graphics g, int cx, int cy) 
    { 
        g.setColor(new Color(0, 115, 0));
        g.fillOval(cx-30, cy-50, 50, 70);
        g.setColor(new Color(50, 26, 61));
        g.fillOval(cx-20, cy-35, 5, 5);
        g.fillOval(cx-10, cy-25,5,5);
        g.fillOval(cx, cy-5,5,5);
    }
}
