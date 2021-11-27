//Java Swing Toolkit Example: beep()
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ToolkitExampleSwing2 {
	public static void main(String[] args) {
        JFrame f=new JFrame("ToolkitExample");

        	JButton b=new JButton("beep");
        	b.setBounds(50,100,80,30);
        	f.add(b);

        	f.setSize(300,300);
        	f.setLayout(null);
        	f.setVisible(true);

        		b.addActionListener(new ActionListener(){
        		    public void actionPerformed(ActionEvent e){
        		        Toolkit.getDefaultToolkit().beep();
            		}
        		});
    }
}