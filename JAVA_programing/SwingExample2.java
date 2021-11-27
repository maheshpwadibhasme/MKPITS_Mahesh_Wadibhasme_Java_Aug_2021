import javax.swing.*;
import java.awt.event.*;
class SwingExample2{
	public static void main(String[] args){
		JFrame f=new JFrame();

		JButton b=new JButton("save");
		b.setBounds(130,100,100,40);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.out.println("Hello From Save Button");
			}
		});
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}