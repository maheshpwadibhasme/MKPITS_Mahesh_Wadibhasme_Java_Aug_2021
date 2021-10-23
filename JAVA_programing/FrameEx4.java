import java.awt.*;
class FrameEx4{
	FrameEx4(){
		Frame fr=new Frame();
		Button b1=new Button("ok");
		b1.setBounds(150,150,100,50);
		fr.setTitle("MAHESH");
		fr.setLayout(null);
		fr.add(b1);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String[] args){
		FrameEx4 f=new FrameEx4();
	}

}