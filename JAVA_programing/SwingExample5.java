//Java JButton Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
class SwingExample5 {
	public static void main(String[] args){
		JFrame f=new JFrame("Button Example");

		final JTextField t1=new JTextField();
		t1.setBounds(70,50,150,20);
		f.add(t1);

		JButton b=new JButton("click me");
		b.setBounds(50,100,95,20);
		b.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent ae){
				t1.setText("Welcome To Home");
			}
		});
		f.add(b);

		JButton b2=new JButton("clear");
		b2.setBounds(160,100,95,20);
		b2.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent ae){
				t1.setText("");
			}
		});
		f.add(b2);


		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}