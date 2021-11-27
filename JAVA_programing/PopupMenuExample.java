//Java AWT PopupMenu Example
import java.awt.*;
import java.awt.event.*;
class PopupMenuExample{
	PopupMenuExample(){
		Frame f=new Frame("Popup Menu Example");
		PopupMenu popupmenu=new PopupMenu("Edit");

		MenuItem cut=new MenuItem("Cut");
		cut.setActionCommand("Cut");

		MenuItem copy=new MenuItem("Copy");
		copy.setActionCommand("Copy");

		MenuItem past=new MenuItem("Past");
		past.setActionCommand("Past");

		popupmenu.add(cut);
		popupmenu.add(copy);
		popupmenu.add(past);

		f.addMouseListener(new MouseAdapter() {
     	   public void mouseClicked(MouseEvent e) {
                popupmenu.show(f , e.getX(), e.getY());
           }
        });


		f.add(popupmenu);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		PopupMenuExample pe1=new PopupMenuExample();
	}
}