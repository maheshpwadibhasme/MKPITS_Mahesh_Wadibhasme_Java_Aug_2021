//Adapterdemo
import java.awt.*;
import java.awt.event.*;
class Adapterdemo extends Frame{
	Adapterdemo(){

		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));

		setSize(400,400);2
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[] args){
			Adapterdemo ad=new Adapterdemo();
	}
}
class MyMouseAdapter extends MouseAdapter{
	Adapterdemo adapterdemo;

	MyMouseAdapter(Adapterdemo adapterdemo){
		this.adapterdemo=adapterdemo;
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Mouse Clicked "+me.getX()+","+me.getY());
	}
}
class MyMouseMotionAdapter extends MouseMotionAdapter{
	Adapterdemo adapterdemo;

	MyMouseMotionAdapter(Adapterdemo adapterdemo){
		this.adapterdemo=adapterdemo;
	}
	public void mouseDragged(MouseEvent me){
		System.out.println("Mouse Dragged");
	}
}