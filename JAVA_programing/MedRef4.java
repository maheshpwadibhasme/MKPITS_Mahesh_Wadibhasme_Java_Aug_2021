interface inter4{
    void dis();
}
class four4{
    public static void name(){
        System.out.println("static method body");
        System.out.println("mai bhi hu1");
        System.out.println("mai bhi hu2");
    }
}
class five5{
    public void name2(){
        System.out.println("without static method body");
    }
}
public class MedRef4 {
    public static void main(String[] args) {
        five5 ob1=new five5();
        inter4 ob=ob1::name2;
        ob.dis();
    }
}
