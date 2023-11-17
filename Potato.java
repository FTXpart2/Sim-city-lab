import java.awt.Graphics;
import java.awt.Color;

public class Potato
{
    public void drawPotato(Graphics g,int cx,int cy) 
    { 
        g.setColor(new Color(150, 75, 0));
        g.fillOval(cx-10,cy-10,40,40);
    }
}
