import java.awt.*;
class FrameA2{
	FrameA2(){
		Frame fr=new Frame();

		TextField t1=new TextField();
		t1.setBounds(40,40,320,40);
		fr.add(t1);

		Button b1=new Button("1");
		b1.setBounds(40,100,96,40);
		fr.add(b1);

		Button b2=new Button("2");
		b2.setBounds(146,100,96,40);
		fr.add(b2);

		Button b3=new Button("3");
		b3.setBounds(252,100,96,40);
		fr.add(b3);

		Button b4=new Button("4");
		b4.setBounds(40,150,96,40);
		fr.add(b4);

		Button b5=new Button("5");
		b5.setBounds(146,150,96,40);
		fr.add(b5);

		Button b6=new Button("6");
		b6.setBounds(252,150,96,40);
		fr.add(b6);

		Button b7=new Button("7");
		b7.setBounds(40,200,96,40);
		fr.add(b7);

		Button b8=new Button("8");
		b8.setBounds(146,200,96,40);
		fr.add(b8);

		Button b9=new Button("9");
		b9.setBounds(252,200,96,40);
		fr.add(b9);

		Button b11=new Button("*");
		b11.setBounds(40,250,96,40);
		fr.add(b11);

		Button b0=new Button("0");
		b0.setBounds(146,250,96,40);
		fr.add(b0);

		Button b12=new Button("/");
		b12.setBounds(252,250,96,40);
		fr.add(b12);

		Button b21=new Button("+");
		b21.setBounds(40,300,96,40);
		fr.add(b21);

		Button b22=new Button("=");
		b22.setBounds(146,300,96,40);
		fr.add(b22);

		Button b23=new Button("-");
		b23.setBounds(252,300,96,40);
		fr.add(b23);


		fr.setTitle("KeyPadMobile");
		fr.setLayout(null);

		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String[] args){
			FrameA2 f=new FrameA2();
	}
}