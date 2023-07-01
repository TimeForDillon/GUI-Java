package ColorName;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ColorNameComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.drawString("Black", 5, 10);
		g2.setColor(Color.BLUE);
		g2.drawString("Blue", 5, 30);
		g2.setColor(Color.CYAN);
		g2.drawString("Cyan", 5, 50);
		g2.setColor(Color.GRAY);
		g2.drawString("Gray", 5, 70);
		g2.setColor(Color.DARK_GRAY);
		g2.drawString("Dark Gray", 5, 90);
		g2.setColor(Color.LIGHT_GRAY);
		g2.drawString("Light Gray", 5, 110);
		g2.setColor(Color.GREEN);
		g2.drawString("Green", 5, 130);
		g2.setColor(Color.MAGENTA);
		g2.drawString("Magenta", 5, 150);
		g2.setColor(Color.ORANGE);
		g2.drawString("Orange", 5, 170);
		g2.setColor(Color.PINK);
		g2.drawString("Pink", 5, 190);
		g2.setColor(Color.RED);
		g2.drawString("Red", 5, 210);
		g2.setColor(Color.YELLOW);
		g2.drawString("Yellow", 5, 230);
	}
}
