import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class LetterE {
	private int xleft;
	private int ytop;
	public LetterE(int x, int y){
		xleft = x;
		ytop = y;
	}
	public void draw(Graphics2D g2){
		Point2D.Double pt1 = new Point2D.Double(xleft+22,ytop);
		Point2D.Double pt2 = new Point2D.Double(xleft+22,ytop+30);
		Line2D.Double side1 = new Line2D.Double(pt1,pt2);
		Point2D.Double pt3 = new Point2D.Double(xleft+42,ytop);
		Line2D.Double side2 = new Line2D.Double(pt1,pt3);
		Point2D.Double pt4 = new Point2D.Double(xleft+27,ytop+15);
		Point2D.Double pt5 = new Point2D.Double(xleft+37,ytop+15);
		Line2D.Double side3 = new Line2D.Double(pt4,pt5);
		Point2D.Double pt6 = new Point2D.Double(xleft+42,ytop+30);
		Line2D.Double side4 = new Line2D.Double(pt2,pt6);
		g2.draw(side1);
		g2.draw(side2);
		g2.draw(side3);
		g2.draw(side4);
	}
}
