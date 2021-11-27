//Java AWT Panel Example
import java.awt.*;
class PanelExample{
	PanelExample(){
		Frame f=new Frame("Panel Example");
		Panel p=new Panel();
		p.setBounds(40,80,200,200);
		p.setBackground(Color.gray);
		f.add(p);

		Button b1=new Button("B1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		p.add(b1);

		Button b2=new Button("B2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.green);
		p.add(b2);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		PanelExample pe1=new PanelExample();
	}
}