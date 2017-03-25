import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class LetterO{
	private int xleft;
	private int ytop;
	public LetterO(int x, int y){
		xleft = x;
		ytop = y;
	}
	public void draw(Graphics2D g2){
		Ellipse2D.Double ellipse = new Ellipse2D.Double(xleft+110, ytop, 20, 30);
		g2.draw(ellipse);
	}
}
