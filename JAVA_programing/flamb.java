interface inter{
    public void name();
    default void name1(){

    }
}
class impl implements inter{
    @Override
    public void name() {
        System.out.println("interface 1 method override");
    }
}
class imp2 implements inter{
    public void name(){
        System.out.println("interface 1 method override");
    }

    @Override
    public void name1() {
        System.out.println("interface 1 default method override");
    }
}
public class flamb {
    public static void main(String[] args) {
        impl ob1=new impl();
        ob1.name();
        ob1.name1();
        imp2 ob2=new imp2();
        ob2.name();
        ob2.name1();
    }
}
