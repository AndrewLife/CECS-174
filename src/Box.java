import java.awt.Rectangle;


public class Box {
public static void main(String[]args){
	Rectangle box= new Rectangle(5,10,20,30);
	System.out.println(box);
	Rectangle box1=box;
	box1.translate(40,50);
	System.out.println(box);
}
}
