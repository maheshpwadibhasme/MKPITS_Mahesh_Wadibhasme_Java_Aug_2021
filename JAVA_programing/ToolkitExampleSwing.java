//Java AWT Toolkit Example with swing

import java.awt.*;
import javax.swing.*;
public class ToolkitExampleSwing {
	public static void main(String[] args) {
      	    Toolkit t = Toolkit.getDefaultToolkit();
      	    System.out.println("Screen resolution = " + t.getScreenResolution());
      	    Dimension d = t.getScreenSize();
      	    System.out.println("Screen width = " + d.width);
      	    System.out.println("Screen height = " + d.height);
      	}
}