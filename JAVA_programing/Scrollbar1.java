import java.awt.*;
import java.awt.event.*;
class Scrollbar1{
	Scrollbar1(){
		Frame f=new Frame("Scrollbar");
		Label label=new Label();
		label.setAlignment(label.CENTER);
		label.setSize(400,100);
		f.add(label);

		Scrollbar s = new Scrollbar();
		s.setOrientation(0);
		s.setBounds(1,370,360,20);
		f.add(s);
		s.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				label.setText("Horizontal Scrollbar Value is: "+s.getValue());
			}
		});

		Label label1=new Label();
		label1.setAlignment(label1.CENTER);
		label1.setSize(400,100);
		f.add(label1);

		Scrollbar s1=new Scrollbar();
		s1.setBounds(370,1,20,360);
		f.add(s1);
		s1.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				label1.setText("Vertical Scrollbar Value is: "+s1.getValue());
			}
		});

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[] args){
		Scrollbar1 se=new Scrollbar1();
	}
}