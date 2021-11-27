//Registration Form
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationForm extends Frame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2;

	RegistrationForm(){
		l1=new JLabel("Registration Form");
		l1.setBounds(100,40,100,25);
		add(l1);

		setSize(400,600);
		setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){

	}
	public static void main(String[] args){
		RegistrationForm r=new RegistrationForm();
	}
}