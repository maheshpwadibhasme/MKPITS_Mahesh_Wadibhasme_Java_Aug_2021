//1- By extending Frame class (inheritance)
//example to create frame by extending frame class

import java.awt.*;
class FrameEx1 extends Frame{
	FrameEx1(){
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args){
		FrameEx1 fr=new FrameEx1();
	}
}
