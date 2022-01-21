interface inf{
    public static void name1(){
        System.out.println("static method in interface");
    }
}
class impl2 implements inf{

}

public class St1 {
    public static void main(String[] args) {
//        impl2 ob=new impl2();
//        ob.name1();
//        impl2.name1();
          inf.name1();

    }
}
