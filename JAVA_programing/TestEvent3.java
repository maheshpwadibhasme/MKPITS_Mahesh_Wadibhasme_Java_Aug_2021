//2- Other class
// Example of event handling by Outer class:
import java.awt.*;
import java.awt.event.*;
class TestEvent3 extends Frame{
	TextField tf;

	TestEvent3(){
		tf=new TextField();
		tf.setBounds(90,70,100,30);
		add(tf);

		Button b1=new Button("click me");
		b1.setBounds(90,140,100,30);
		Outer o=new Outer(this);
		b1.addActionListener(o);
		add(b1);

		setTitle("Other class");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		TestEvent3 t=new TestEvent3();
	}
}

//import java.awt.event.*;
class Outer implements ActionListener{
	TestEvent3 te3;
	Outer(TestEvent3 te3){
		this.te3=te3;
	}
	public void actionPerformed(ActionEvent ae){
		te3.tf.setText("Welcome");
	}
}