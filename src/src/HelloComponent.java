import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HelloComponent extends JComponent{
	public void paintComponent (Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		LetterH H = new LetterH(10,10);
		LetterE E = new LetterE(10,10);
		LetterL L = new LetterL(10,10);
		LetterL L2 = new LetterL(35,10);
		LetterO O = new LetterO(0,10);
		H.draw(g2);
		E.draw(g2);
		L.draw(g2);
		L2.draw(g2);
		O.draw(g2);
	}

}
