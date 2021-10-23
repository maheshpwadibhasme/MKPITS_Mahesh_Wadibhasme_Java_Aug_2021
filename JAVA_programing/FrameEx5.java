//example to create a login form
import java.awt.*;
class FrameEx5{
	FrameEx5(){
		Frame fr=new Frame();
		Label l1=new Label("Mkpits Solution");
		l1.setBounds(150,50,100,30);
		fr.add(l1);

		Label l2=new Label("Signin please");
		l2.setBounds(155,80,100,30);
		fr.add(l2);

		Label l3=new Label("User Name :- ");
		l3.setBounds(50,130,100,30);
		fr.add(l3);
		TextField t1=new TextField();
		t1.setBounds(170,130,200,25);
		fr.add(t1);

		Label l4=new Label("Password :- ");
		l4.setBounds(50,160,100,30);
		fr.add(l4);
		TextField t2=new TextField();
		t2.setBounds(170,160,200,25);
		fr.add(t2);

		Button b1=new Button("Login");
		b1.setBounds(170,200,100,30);
		fr.add(b1);

		fr.setTitle("MKPITS");
		fr.setLayout(null);

		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String[] args){
			FrameEx5 f=new FrameEx5();
	}
}