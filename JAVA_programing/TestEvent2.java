//1-Same class
//Example of event handling within class:
//another example with 2 buttons
import java.awt.*;
import java.awt.event.*;
class TestEvent2 extends Frame implements ActionListener{
	TextField tf;
	Button b1,b2;

	TestEvent2(){
		tf=new TextField();
		tf.setBounds(80,70,100,30);
		add(tf);

		b1=new Button("click me");
		b1.setBounds(25,150,100,30);
		b1.addActionListener(this);
		add(b1);

		b2=new Button("clear");
		b2.setBounds(140,150,100,30);
		b2.addActionListener(this);
		add(b2);

		setTitle("Within class");
		setLayout(null);
		setSize(300,300);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent  ae){
		if(ae.getSource()==b1){
			tf.setText("Mahesh");
		}
		if(ae.getSource()==b2){
			tf.setText("");
		}
	}
	public static void main(String[] args){
		TestEvent2 te2=new TestEvent2();
	}
}