import java.awt.Color;
import java.awt.Graphics;

public class Sun {

	// Current position
	private int x;
	private int y;

	// Information about circular path
	private int centerX;
	private int centerY;
	private int radius;
	private double angle;
	private double rotationSpeed;

	// constructor
	public Sun(int centerX, int centerY, int radius, double rotationSpeed){
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.angle = 0;
		this.rotationSpeed = rotationSpeed;
		circularOrbit();
	}
  
  
	// Custom draw function to draw an 800x600 background at (0,0)
  public void draw(Graphics g)
  {
     Color sunYellow = new Color(236, 245, 66);
    g.setColor(sunYellow);
    g.fillOval(x,y,150,150);
    int r = 90;
    int R = 150;
        
    double delta = 0.1;
        int centerx = x+75;
        int centery = y+75;
        for (double theta = 0; theta < Math.PI * 2; theta += delta){
          g.drawLine(centerx + (int)(r * Math.cos(theta)), centery + (int)(r * Math.sin(theta)), centerx + (int)(R * Math.cos(theta)), centery + (int)(R * Math.sin(theta)));
        
        }
    }

	public void circularOrbit(){
		// add to the angle
		angle -= rotationSpeed;

		// x = centerX + r * cos(angle)
		x = (int) ( centerX + radius * Math.cos(angle) );
		// y = centerY + r * sin(angle)
		y = (int) ( centerY + radius * Math.sin(angle) );
	}
  public int getY(){
    return y;
  }
  public int getSunMin(){
    return centerY-radius;
  }
  public int getSunMax(){
    return centerY+radius;
  }
}
