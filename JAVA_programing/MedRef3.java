interface inter3{
    void dis();
}
class three3{
    public static void name(){
        System.out.println("static method body");
        System.out.println("mai bhi hu1");
        System.out.println("mai bhi hu2");
    }
}

public class MedRef3 {
    public static void main(String[] args) {
        inter3 ob=three3::name;
        ob.dis();

    }
}
