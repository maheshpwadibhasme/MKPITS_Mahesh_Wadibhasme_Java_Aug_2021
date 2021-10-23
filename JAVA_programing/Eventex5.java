//example 4 :- wap to accept 3 subject marks and display total, percentage and grade;
import java.awt.*;
import java.awt.event.*;
class Eventex5 extends Frame implements ActionListener{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3;
	Button b1;

	Eventex5(){
		l1=new Label("Math:-");
		l1.setBounds(20,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(150,50,100,25);
		add(t1);

		l2=new Label("Phy:-");
		l2.setBounds(20,100,100,25);
		add(l2);
		t2=new TextField();
		t2.setBounds(150,100,100,25);
		add(t2);

		l3=new Label("Chem:-");
		l3.setBounds(20,150,100,25);
		add(l3);
		t3=new TextField();
		t3.setBounds(150,150,100,25);
		add(t3);

		l4=new Label("Total:-");
		l4.setBounds(20,250,100,25);
		add(l4);

		l5=new Label("Percentage:-");
		l5.setBounds(20,280,200,25);
		add(l5);

		l6=new Label("grade:-");
		l6.setBounds(20,310,100,25);
		add(l6);

		b1=new Button("Total");
		b1.setBounds(150,200,100,25);
		b1.addActionListener(this);
		add(b1);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		int s1=Integer.parseInt(t1.getText());
		int s2=Integer.parseInt(t2.getText());
		int s3=Integer.parseInt(t3.getText());

		int total=0;
		float per=0;
		String grade=null;

		if(ae.getSource()==b1){
			total=s1+s2+s3;
			per=(float)(total/300.0f)*100.0f;
			if(per>=75)
				grade="distingtion";
			else if(per>60 && per<75)
				grade="First";
			else
				grade="Fail";
		}

		l4.setText("total:"+total);
		l5.setText("Percentage: "+per);
		l6.setText("grade: "+grade);

	}
	public static void main(String[] args){
		Eventex5 f=new Eventex5();
	}
}
