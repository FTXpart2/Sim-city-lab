import javax.swing.JPanel;	// Extending JPanel class
import java.awt.Dimension;	// Setting dimensions of JPanel
import java.awt.Graphics;	// Using Graphics object to draw

public class MyPanel extends JPanel
{
	// Instance variables of the objects I will draw
	Background bg;

  Sun sun;
 

	// When MyPanel gets instantiated, it sets up all objects it will use
	public MyPanel(){

    sun = new Sun(100,700,850,0.01);

		bg = new Background(sun);
  
  
	}

	// Set dimensions to 800x600 pixels
	public Dimension getPreferredSize() {
        return new Dimension(725,768);
    }

	// Gets called automatically
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);	
    bg.draw(g);
    sun.draw(g);
    // signals start coordinates
    int startX=20;
    int startY=20;
    for (int row = 4; row <= 8; row++) 
      {
      for (int col = 0; col <= 5; col++)
        {
          int x = col * 60 + startX;  // coordinates changed and seperates the crops
          int y = row * 100 + startY;
          Berries berry = new Berries();
          berry.drawBerries(g, x, y);
                    
        }
      }
          //same thing as the berry code
      startX += 400;   
      startY += 400;
    for (int row = 0; row <= 1; row++) 
        {
          for (int col = 0; col <= 2; col++)
          {
           int x2 = col* 60  + startX; 
            int y2 = row*100 + startY;
            Potato potato = new Potato();
            potato.drawPotato(g, x2, y2);
          }
     }
          
      startX += 10;    
      startY += 200;
      for (int row = 0; row <= 1; row++) 
      {
        for (int col = 0; col <= 2; col++)
        {
          int x4 = col* 60  + startX; 
          int y4 = row*100 + startY;
          Eggplant eggplant = new Eggplant();
          eggplant.drawEggplant(g, x4, y4);
               }
          }

      startX += 210;   
      startY -= 100;
      for (int row = 0; row <= 2; row++) 
        {
          for (int col = 0; col <= 2; col++)
            {
              int x3 = col* 30  + startX; 
              int y3 = row*100 + startY;
              Wheat wheat = new Wheat();
              wheat.drawWheat(g, x3, y3);
               }
          }
  }

	public void animationLoop(){

		// forever loop
		while (true){

			// wait for some time
			try {
				// wait 10 milliseconds
				Thread.sleep(20);	
			}
			// In case there is an error interrupting any process
			catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			// change something

      bg.update();
			sun.circularOrbit();

			// redraw the screen
			repaint();

		}
	}

}
