interface inter5{
    void dis(int a);
}
class one11{
    public static void name(int i){
        System.out.println("static method body"+i);
    }
}
class two12{
    public void name2(){
        System.out.println("without static method body");
    }
}
class three13{
    public three13(){
        System.out.println("my constructor");
    }
}
public class MedRef5 {
    public static void main(String[] args) {
//        two12 ob1=new two12();
//        inter5 ob=three13::new;
//        ob.dis();
        inter5 ob=one11::name;
        ob.dis(10);
    }
}
