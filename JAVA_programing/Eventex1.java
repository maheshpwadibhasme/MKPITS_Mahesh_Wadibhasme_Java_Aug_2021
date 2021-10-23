import java.awt.*;
import java.awt.event.*;
class Eventex1 extends Frame implements ActionListener{
	Eventex1(){
		Button b1=new Button("ok");
		b1.setBounds(150,50,100,25);
		//register the button component with the listener
		b1.addActionListener(this);
		add(b1);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	//implementation of actionlistener interface method actionperformed
	public void actionPerformed(ActionEvent ae){
		System.out.println("hello from Button");
	}

	public static void main(String[] args){
		Eventex1 e=new Eventex1();
	}
}