import java.awt.*;
import java.awt.event.*;
class Adapterex4 extends Frame{
	Label l1;
	TextField t1;

	Adapterex4(){
		l1=new Label("enter characters");
		l1.setBounds(90,40,100,25);
		add(l1);

		t1=new TextField(20);
		t1.setBounds(90,90,100,25);
		t1.addKeyListener(new KeyAdapterChar(this));
		add(t1);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		Adapterex4 ad4= new Adapterex4();
	}
}
class KeyAdapterChar extends KeyAdapter{
	Adapterex4 ad;
	KeyAdapterChar(Adapterex4 ad){
		this.ad=ad;
	}
	public void keyTyped(KeyEvent ke){
		char c=ke.getKeyChar();
		System.out.println("Clicked "+c);
	}
}