import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class LetterL {
	private int xleft;
	private int ytop;
	public LetterL(int x, int y){
		xleft = x;
		ytop = y;
	}
	public void draw(Graphics2D g2){
		Point2D.Double pt1 = new Point2D.Double(xleft+50,ytop);
		Point2D.Double pt2 = new Point2D.Double(xleft+50,ytop+30);
		Point2D.Double pt3 = new Point2D.Double(xleft+70,ytop+30);
		Line2D.Double side1 = new Line2D.Double(pt1,pt2);
		Line2D.Double side2 = new Line2D.Double(pt2,pt3);
		g2.draw(side1);
		g2.draw(side2);
	}
}
