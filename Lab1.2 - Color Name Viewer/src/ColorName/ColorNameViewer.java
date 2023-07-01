package ColorName;
import javax.swing.JFrame;

public class ColorNameViewer
{
	public static void main(String[] args)
	{
		// Construct JFrame
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("ColorNameViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent component = new ColorNameComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}