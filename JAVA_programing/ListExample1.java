//Java AWT List Example
import java.awt.*;
class ListExample1{
	ListExample1(){
		Frame f=new Frame();
		List l1=new List(5);
		l1.setBounds(100,100,75,75);
		f.add(l1);
		l1.add("Maths");
		l1.add("Phy");
		l1.add("Chem");
		l1.add("Bio");
		l1.add("Marathi");

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		ListExample1 le=new ListExample1();
	}
}