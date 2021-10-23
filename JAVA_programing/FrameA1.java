import java.awt.*;
class FrameA1{
	FrameA1(){
		Frame fr=new Frame();

		Label l1=new Label("Signup Form");
		l1.setBounds(150,50,100,30);
		fr.add(l1);

		Label l2=new Label("User Name:-");
		l2.setBounds(80,90,100,25);
		fr.add(l2);
		TextField t1=new TextField();
		t1.setBounds(180,90,150,25);
		fr.add(t1);

		Label l3=new Label("Password:-");
		l3.setBounds(80,130,100,25);
		fr.add(l3);
		TextField t2=new TextField();
		t2.setBounds(180,130,150,25);
		fr.add(t2);

		Label l4=new Label("Email:-");
		l4.setBounds(80,170,100,25);
		fr.add(l4);
		TextField t3=new TextField();
		t3.setBounds(180,170,150,25);
		fr.add(t3);

		Label l5=new Label("Mobile no:-");
		l5.setBounds(80,210,100,25);
		fr.add(l5);
		TextField t4=new TextField();
		t4.setBounds(180,210,150,25);
		fr.add(t4);

		Button b1=new Button("Register");
		b1.setBounds(140,250,100,40);
		fr.add(b1);

		fr.setTitle("mahesh.pvt");
		fr.setLayout(null);

		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String[] args){
		FrameA1 f=new FrameA1();
	}
}