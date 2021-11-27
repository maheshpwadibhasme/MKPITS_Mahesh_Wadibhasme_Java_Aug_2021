//Simple example of Swing by inheritance
//We can also inherit the JFrame class, so there is no need to create the instance of JFrame class explicitly.
import javax.swing.*;
import java.awt.event.*;
class SwingExample4 extends JFrame{
	SwingExample4(){
		JButton b=new JButton("ok");
		b.setBounds(100,100,100,30);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.out.println("button pressed");
			}
		});
		add(b);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		SwingExample4 s=new SwingExample4();
	}
}