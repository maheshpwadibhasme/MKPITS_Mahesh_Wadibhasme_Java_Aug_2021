//Java JPasswordField Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
class SwingPassword {
	public static void main(String[] args){
		JFrame f=new JFrame("Password Field Example");

		final JLabel l=new JLabel();
		l.setBounds(20,150,250,50);
		f.add(l);

		final JPasswordField pw=new JPasswordField();
		pw.setBounds(100,75,100,30);
		f.add(pw);

		JLabel l1=new JLabel("UserName");
		l1.setBounds(20,20,80,30);
		f.add(l1);

		JLabel l2=new JLabel("Password");
		l2.setBounds(20,75,80,30);
		f.add(l2);

		JButton b1=new JButton("Login");
		b1.setBounds(100,120,80,30);
		f.add(b1);

		final JTextField t1=new JTextField();
		t1.setBounds(100,20,100,30);
		f.add(t1);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String data ="UserName: "+t1.getText();
				data +=",Password: "+new String(pw.getPassword());
				l.setText(data);
			}
		});
	}
}