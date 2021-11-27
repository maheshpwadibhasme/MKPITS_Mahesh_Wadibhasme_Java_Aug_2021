//mouse
//without adapter
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class MouseEvent1 extends Frame implements MouseListener,MouseMotionListener{
	TextField t1;
	MouseEvent1(){
		t1=new TextField();
		t1.setBounds(10,30,300,30);
		add(t1);
		addMouseListener(this);
		addMouseMotionListener(this);

		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void mousePressed(MouseEvent me){
		t1.setText("Left Mouse Buttton Down At "+me.getX()+","+me.getY());
	}
	public void mouseReleased(MouseEvent me){
		t1.setText("Mouse Button Went UP");
	}
	public void mouseEntered(MouseEvent me){
		t1.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent me){
		t1.setText("Mouse Exited");
	}
	public void mouseDragged(MouseEvent me){
		t1.setText("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me){
		t1.setText("Mouse Moved");
	}
	public void mouseClicked(MouseEvent me){
		t1.setText("Mouse Clicked");
	}

	public static void main(String[] args){
		MouseEvent1 me1=new MouseEvent1();
	}
}