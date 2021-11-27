//1-Same class
//Example of event handling within class:
import java.awt.*;
import java.awt.event.*;
class TestEvent extends Frame implements ActionListener{
	TextField tf;
	TestEvent(){
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		add(tf);

		Button b1=new Button("click me");
		b1.setBounds(100,120,80,30);
		b1.addActionListener(this);
		add(b1);

		setLayout(null);
		setSize(400,400);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		tf.setText("Welcome");
	}
	public static void main(String[] args){
		TestEvent te=new TestEvent();
	}
}