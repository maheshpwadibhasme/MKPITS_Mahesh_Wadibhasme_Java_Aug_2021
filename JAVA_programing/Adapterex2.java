//with key adapter
import java.awt.*;
import java.awt.event.*;
class Adapterex2 extends Frame{
	Label l1;
	TextField t1;
	Adapterex2(){
		l1=new Label("mahesh");
		l1.setBounds(100,40,100,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(100,80,100,25);
		t1.addKeyListener(new KeyAdapterClass(this));
		add(t1);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		Adapterex2 ad2=new Adapterex2();
	}
}
class KeyAdapterClass extends KeyAdapter{
	Adapterex2 ad;
	KeyAdapterClass(Adapterex2 ad){
		this.ad=ad;
	}
	public void keyTyped(KeyEvent ke){
		System.out.println("Key Typed");
	}
}