//java swing toolkit example 1
//Java swing Toolkit Example: Change TitleBar Icon

import java.awt.*;
import javax.swing.*;
class ToolkitExampleSwing3 {
    ToolkitExampleSwing3(){
    	JFrame f=new JFrame();

    	Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");

    	f.setIconImage(icon);

    	f.setLayout(null);
    	f.setSize(400,400);
    	f.setVisible(true);
    }
    	public static void main(String args[]){
    	new ToolkitExampleSwing3();
    	}
}