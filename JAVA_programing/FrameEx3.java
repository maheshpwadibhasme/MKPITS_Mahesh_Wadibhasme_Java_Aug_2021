//example to create a button inside frame
import java.awt.*;
class FrameEx3 extends Frame{
	FrameEx3(){
		Button b1=new Button("ok");
		b1.setBounds(150,100,100,50);

		setTitle("MKPITS");
		setLayout(null);
		add(b1);

		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args){
		FrameEx3 f=new FrameEx3();
	}
}