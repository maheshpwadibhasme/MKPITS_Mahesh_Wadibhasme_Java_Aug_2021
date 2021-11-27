//Java AWT Panel Example with swing
import java.awt.*;
import javax.swing.*;
class PanelExampleSwing{
	PanelExampleSwing(){
		JFrame f=new JFrame("Panel Example");
		JPanel p=new JPanel();
		p.setBounds(40,80,200,200);
		p.setBackground(Color.gray);
		f.add(p);

		JButton b1=new JButton("B1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		p.add(b1);

		JButton b2=new JButton("B2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.green);
		p.add(b2);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		PanelExampleSwing pe1=new PanelExampleSwing();
	}
}