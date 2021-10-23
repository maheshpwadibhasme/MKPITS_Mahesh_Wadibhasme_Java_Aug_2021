//3- wap to accept a no. and print table of that number.
import java.awt.*;
import java.awt.event.*;
class Eventex6 extends Frame implements ActionListener{
	Label l1;
	TextArea l2;
	TextField t1;
	Button b1;

	Eventex6(){
		l1=new Label("Enter number:-");
		l1.setBounds(20,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(150,50,100,25);
		add(t1);

		b1=new Button("Print Table");
		b1.setBounds(70,110,100,25);
		b1.addActionListener(this);
		add(b1);

		l2=new TextArea(30,30);
		l2.setBounds(20,200,100,100);
		add(l2);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		int n1=Integer.parseInt(t1.getText());
		int res=0;
		StringBuilder sb=new StringBuilder();
		if(ae.getSource()==b1){
			for(int i=0;i<=10;i++){
				res=n1*i;
				sb.append(n1+" * "+i+" = "+res+"\n");
			}
			l2.setText(sb.toString());
		}


	}
	public static void main(String[] args){
		Eventex6 f=new Eventex6();
	}
}