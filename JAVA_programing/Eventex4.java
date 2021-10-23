//example 3 :wap to accept 2 no. and create buttons for  addtion , substraction and multiplication
import java.awt.*;
import java.awt.event.*;
class Eventex4 extends Frame implements ActionListener{
			Label l1,l2,l3;
			TextField t1,t2;
			Button b1,b2,b3;
	Eventex4(){

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

		b1=new Button("Addition");
		b1.setBounds(20,170,100,25);
		b1.addActionListener(this);
		add(b1);

		b2=new Button("Substaction");
		b2.setBounds(135,170,100,25);
		b2.addActionListener(this);
		add(b2);

		b3=new Button("Multiply");
		b3.setBounds(250,170,100,25);
		b3.addActionListener(this);
		add(b3);

		l3=new Label("Result:");
		l3.setBounds(20,250,100,25);
		add(l3);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		int res=0;
		if(ae.getSource()==b1){
			res=num1+num2;
		}
		if(ae.getSource()==b2){
			res=num1-num2;
		}
		if(ae.getSource()==b3){
			res=num1*num2;
		}
		l3.setText("Result: "+res);

	}

	public static void main(String[] args){
		Eventex4 f=new Eventex4();
	}

}
