//another program to accept 2 no. from the user and display the additon of 2 no.
import java.awt.*;
import java.awt.event.*;
public class FrameAdd extends Frame{
	FrameAdd(){
		Label l1=new Label("num1");
		l1.setBounds(40,50,100,25);
		add(l1);

		TextField t1=new TextField();
		t1.setBounds(150,50,100,25);
		add(t1);

		Label l2=new Label("num2");
		l2.setBounds(40,90,100,25);
		add(l2);

		TextField t2=new TextField();
		t2.setBounds(150,90,100,25);
		add(t2);

		Label l3=new Label("Res");
		l3.setBounds(40,210,100,25);
		add(l3);

		TextField t3=new TextField();
		t3.setBounds(150,210,100,25);
		add(t3);

		Button b1=new Button("Addition");
		b1.setBounds(80,160,100,30);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String str1 = t1.getText();
				double fn=Double.parseDouble(str1);
				double sn=Double.parseDouble(t2.getText());

				t3.setText("sum is  "+(fn+sn));
			}
		});
		add(b1);

		setTitle("Calculater");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		FrameAdd f=new FrameAdd();
	}
}