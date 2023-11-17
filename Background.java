import java.awt.Graphics;	// Import Graphics to draw
import java.awt.Color;		// Import Color to use colors

public class Background
{
  int sunY;
  Sun sun;
  double percentBright;
  int sunMin, sunMax;
  public Background(Sun sun){
    this.sun = sun;
    sunMin = sun.getSunMin();
    sunMax = sun.getSunMax();
  }
	// Custom draw function to draw an 800x600 background at (0,0)
  public void draw(Graphics g)
  {
  // Draw sky first over whole 800x600 JPanel
  
    Color skyBlue = new Color((int)(119*percentBright), (int)(162*percentBright), (int)(230*percentBright));
  
    g.setColor(skyBlue);
    g.fillRect(0,0,1366,600); 	
    
    Color grassGreen = new Color(64,128,0);
    g.setColor(grassGreen);
    g.fillRect(0,300,1366, 800);
  }

  public void update(){
    // get sunY
    // calculate percent up/down
      // (sunMax-sunY) - pixels sun is from the bottom of circle
      // (sunMax-sunY)*1.0/(sunMax-sunMin) - percent brightness
    // percentBright = ... the above stuff
    sunY = sun.getY();
    percentBright = (sunMax-sunY)*1.0/(sunMax-sunMin);
    
    
    
    
  }
  
}
        
    

