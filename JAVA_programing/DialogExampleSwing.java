//Java AWT Dialog Example

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    public class DialogExampleSwing {
        private static Dialog d;
        DialogExampleSwing() {
            JFrame f= new JFrame();
            d = new Dialog(f , "Dialog Example", true);
            d.setLayout( new FlowLayout() );
            JButton b = new JButton ("OK");
            b.addActionListener ( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {
                    DialogExampleSwing.d.setVisible(false);
                }
            });
            d.add( new Label ("Click button to continue."));
            d.add(b);
            d.setSize(300,300);
            d.setVisible(true);
        }
        public static void main(String args[])
        {
            new DialogExampleSwing();
        }
    }