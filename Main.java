import javax.swing.JFrame; //Must import the JFrame

public class Main
{
	
	public static void main( String[] args )
	{
		JFrame frame = new JFrame("Scenery");
		
		MyPanel canvas = new MyPanel();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(canvas);
		frame.pack();
		
		frame.setVisible(true);
    canvas.animationLoop();
    }
}
