//Java AWT Panel two Example with swing
import java.awt.*;
import javax.swing.*;
class PanelExampleSwing2{
	PanelExampleSwing2(){
	JFrame f=new JFrame("Panel Example2");
	JPanel p1=new JPanel();
	p1.setBounds(40,70,250,250);
	p1.setBackground(Color.gray);
	f.add(p1);

	JPanel p2=new JPanel();
	p2.setBounds(330,70,250,250);
	p2.setBackground(Color.gray);
	f.add(p2);

	JButton b1=new JButton("B1");
	b1.setBounds(40,100,80,30);
	b1.setBackground(Color.blue);
	p1.add(b1);

	JButton b2=new JButton("B2");
	b2.setBounds(160,100,80,30);
	b2.setBackground(Color.yellow);
	p1.add(b2);

	JButton b3=new JButton("B3");
	b3.setBounds(40,100,80,30);
	b3.setBackground(Color.blue);
	p2.add(b3);

	JButton b4=new JButton("B4");
	b4.setBounds(160,100,80,30);
	b4.setBackground(Color.yellow);
	p2.add(b4);


	f.setSize(620,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String[] args){
		PanelExampleSwing2 pe2=new PanelExampleSwing2();
	}
}