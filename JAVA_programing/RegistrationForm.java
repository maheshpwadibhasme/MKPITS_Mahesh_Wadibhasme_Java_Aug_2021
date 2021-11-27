//Registration Form
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationForm extends Frame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2;
	JCheckBox cb1,cb2;
	JRadioButton rb1,rb2;
	JComboBox c1;
	JButton b;

	RegistrationForm(){
		l1=new JLabel("Registration Form");
		l1.setBounds(120,40,200,25);
		add(l1);

		l2=new JLabel("Username: ");
		l2.setBounds(60,80,150,25);
		add(l2);
		t1=new JTextField();
		t1.setBounds(190,80,160,25);
		add(t1);


		l3=new JLabel("Hobby: ");
		l3.setBounds(60,120,150,25);
		add(l3);

		cb1=new JCheckBox("Music");
		cb1.setBounds(190,120,80,25);
		add(cb1);
		cb2=new JCheckBox("Reading");
		cb2.setBounds(270,120,80,25);
		add(cb2);

		l4=new JLabel("Gender: ");
		l4.setBounds(60,160,150,25);
		add(l4);

		rb1=new JRadioButton("Male");
		rb1.setBounds(190,160,80,25);
		add(rb1);
		rb2=new JRadioButton("Female");
		rb2.setBounds(270,160,80,25);
		add(rb2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		l5=new JLabel("City: ");
		l5.setBounds(60,200,150,25);
		add(l5);
		String[] ct={"Nagpur","Bhadara","Gondia","Amravati","Pune","Mumbai","Hydrabad","Chennai","Bangloru"};
		c1=new JComboBox(ct);
		c1.setBounds(190,200,160,25);
		add(c1);

		b=new JButton("Login");
		b.setBounds(120,240,100,25);
		add(b);

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