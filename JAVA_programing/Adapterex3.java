import java.awt.*;
import java.awt.event.*;
class Adapterex3 extends Frame{
	Label l1;
	TextField t1;
	Adapterex3(){
		l1=new Label("mahesh");
		l1.setBounds(90,50,100,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(90,90,100,25);
		t1.addKeyListener(new KeyAdapterClass(this));
		add(t1);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		Adapterex3 ad3=new Adapterex3();
	}
}
class KeyAdapterClass extends KeyAdapter{
	Adapterex3 ad;
	KeyAdapterClass(Adapterex3 ad){
		this.ad=ad;
	}
	public void keyTyped(KeyEvent ke){
		System.out.println("Key Typed");
		char c=ke.getKeyChar();
		System.out.println("Char Typed " + c);
		ad.l1.setText(ad.t1.getText());
	}
}