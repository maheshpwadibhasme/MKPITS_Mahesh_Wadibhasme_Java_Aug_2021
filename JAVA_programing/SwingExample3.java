//Example of Swing by Association inside constructor
import javax.swing.*;
class SwingExample3{
	JFrame f;
	SwingExample3(){
		f=new JFrame("Swing example");

		JButton b=new JButton("ok");
		b.setBounds(90,100,100,30);
		f.add(b);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		SwingExample3 s=new SwingExample3();
	}
}