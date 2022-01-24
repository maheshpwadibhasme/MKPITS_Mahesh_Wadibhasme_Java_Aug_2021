interface intertwo{
    void dis();
}
class two{
    public static void name(){
        System.out.println("static method body");
    }
}
public class MedRef2 {
    public static void main(String[] args) {
        intertwo ob=two::name;
        ob.dis();
    }
}
