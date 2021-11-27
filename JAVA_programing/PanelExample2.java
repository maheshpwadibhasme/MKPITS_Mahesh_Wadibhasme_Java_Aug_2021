//Java AWT Panel two Example
import java.awt.*;
class PanelExample2{
	PanelExample2(){
	Frame f=new Frame("Panel Example2");
	Panel p1=new Panel();
	p1.setBounds(40,70,250,250);
	p1.setBackground(Color.gray);
	f.add(p1);

	Panel p2=new Panel();
	p2.setBounds(330,70,250,250);
	p2.setBackground(Color.gray);
	f.add(p2);

	Button b1=new Button("B1");
	b1.setBounds(40,100,80,30);
	b1.setBackground(Color.blue);
	p1.add(b1);

	Button b2=new Button("B2");
	b2.setBounds(160,100,80,30);
	b2.setBackground(Color.yellow);
	p1.add(b2);

	Button b3=new Button("B3");
	b3.setBounds(40,100,80,30);
	b3.setBackground(Color.blue);
	p2.add(b3);

	Button b4=new Button("B4");
	b4.setBounds(160,100,80,30);
	b4.setBackground(Color.yellow);
	p2.add(b4);


	f.setSize(620,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String[] args){
		PanelExample2 pe2=new PanelExample2();
	}
}