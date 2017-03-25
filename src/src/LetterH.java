import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class LetterH {
private int xleft;
private int ytop;
public LetterH(int x, int y){
	xleft = x;
	ytop = y;
}
public void draw(Graphics2D g2){
	Point2D.Double pt1 = new Point2D.Double(xleft,ytop);
	Point2D.Double pt2 = new Point2D.Double(xleft,ytop+30);
	Line2D.Double side1 = new Line2D.Double(pt1,pt2);
	Point2D.Double pt3 = new Point2D.Double(xleft,ytop+15);
	Point2D.Double pt4 = new Point2D.Double(xleft+15,ytop+15);
	Line2D.Double side2 = new Line2D.Double(pt3,pt4);
	Point2D.Double pt5 = new Point2D.Double(xleft+15,ytop);
	Point2D.Double pt6 = new Point2D.Double(xleft+15,ytop+30);
	Line2D.Double side3 = new Line2D.Double(pt5,pt6);
	g2.draw(side1);
	g2.draw(side2);
	g2.draw(side3);
}
}
