//example 3 : wap to accept 2 no. and print addition of 2 no.
import java.awt.*;
import java.awt.event.*;
class Eventex3 extends Frame implements ActionListener{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;

	Eventex3(){
		l1=new Label("Enter number1:");
		l1.setBounds(20,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(150,50,100,25);
		add(t1);

		l2=new Label("Enter number2:");
		l2.setBounds(20,100,100,25);
		add(l2);
		t2=new TextField();
		t2.setBounds(150,100,100,25);
		add(t2);

		l3=new Label("Addition:");
		l3.setBounds(20,250,100,25);
		add(l3);

		b1=new Button("Add");
		b1.setBounds(90,170,70,25);
		b1.addActionListener(this);
		add(b1);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int add=num1+num2;
		l3.setText("Addition:-"+add);

	}
	public static void main(String[] args){
		Eventex3 f=new Eventex3();
	}
}