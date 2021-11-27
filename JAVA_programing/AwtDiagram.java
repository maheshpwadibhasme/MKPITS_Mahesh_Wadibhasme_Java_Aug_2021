import java.awt.*;
class AwtDiagram{
	public static void main(String[] args){
		Frame f=new Frame("My Frame");
		String title ="Raisonic";;
		boolean modal=true;

		Dialog dlg=new Dialog(f,title,modal);

		Label l1=new Label("Do You Want To Close");
		dlg.add(l1);

		Button b1=new Button("ok");
		dlg.add(b1);

		Button b2=new Button("Close");
		dlg.add(b2);

		f.setSize(300,300);
		f.setVisible(true);

		dlg.setSize(200,200);
		dlg.setVisible(true);
	}
}