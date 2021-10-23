//By creating the object of Frame class (association)

import java.awt.*;
class FrameEx2{
	FrameEx2(){
		Frame fr=new Frame();
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public static void main(String[] args){
		FrameEx2 f=new FrameEx2();
	}
}