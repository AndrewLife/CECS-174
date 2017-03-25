import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
public class NameComponent extends JComponent {
public void paintComponent (Graphics g){
	Graphics2D g2 = (Graphics2D) g;
	Rectangle box = new Rectangle(5,10,200,200);
	g2.setColor(Color.BLUE);
	g2.fillRect(5, 10, 200,200);
	g2.draw(box);
	g2.setColor(Color.red);
	g2.drawString("Andrew Fung", 70, 70);
}
}
