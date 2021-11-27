//example of login form
import javax.swing.*;
import java.awt.event.*;
class SwingExample6 extends JFrame{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField pw;

	SwingExample6(){
		l1=new JLabel("User Name");
		l1.setBounds(40,60,100,25);
		add(l1);

		t1=new JTextField();
		t1.setBounds(135,60,100,25);
		add(t1);

		l2=new JLabel("Password");
		l2.setBounds(40,100,100,25);
		add(l2);

		pw=new JPasswordField();
		pw.setBounds(135,100,100,25);
		add(pw);

		JButton b=new JButton("save");
		b.setBounds(80,150,100,30);
		b.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("admin")&&pw.getText().equals("admin")){
					l3.setText("login successfull");
				}
				else{
					l3.setText("invalid credentials");
				}
			}
		});
		add(b);

		l3=new JLabel("Status");
		l3.setBounds(80,200,150,25);
		add(l3);

		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		SwingExample6 s=new SwingExample6();
	}
}