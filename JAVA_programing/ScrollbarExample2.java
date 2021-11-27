//java awt scrollbar example 1
//Java AWT Vertical Scrollbar Example with AdjustmentListener
import java.awt.*;
import java.awt.event.*;
class ScrollbarExample2{
	ScrollbarExample2(){
		Frame f=new Frame("Scrollbar Example2");
		Label label=new Label();
		label.setAlignment(label.CENTER);
		label.setSize(400,100);
		f.add(label);

		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,100);
		f.add(s);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

		s.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				label.setText("Vertical Scrollbar Value is: "+s.getValue());
			}
		});
	}
	public static void main(String[] args){
		ScrollbarExample2 sc2=new ScrollbarExample2();
	}
}