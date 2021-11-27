//java awt scrollbar example 1
//Java AWT Horizontal Scrollbar Example with AdjustmentListener
import java.awt.*;
import java.awt.event.*;
class ScrollbarExample3{
	ScrollbarExample3(){
		Frame f=new Frame("Scrollbar Example3");
		Label label=new Label();
		label.setAlignment(label.CENTER);
		label.setSize(400,100);
		f.add(label);

		Scrollbar s=new Scrollbar();
		s.setOrientation(0);
		s.setBounds(100,100,250,20);
		f.add(s);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

		s.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				label.setText("Horizontal Scrollbar is: "+s.getValue());
			}
		});

	}
	public static void main(String[] args){
		ScrollbarExample3 se3=new ScrollbarExample3();
	}
}