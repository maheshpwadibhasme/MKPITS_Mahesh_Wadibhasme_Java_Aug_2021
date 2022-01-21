import java.util.Base64;

class Encoder{
    String Ename;
    byte[] encFun(String name){
        Ename=name;
        byte[] encode= Base64.getEncoder().encode(Ename.getBytes());
        return encode;
    }
    String deFun(byte[] data){
        byte[] decode=Base64.getDecoder().decode(data);
        return (new String(decode));
    }
}
public class EnDnEx1 {
    public static void main(String[] args) {
        Encoder e=new Encoder();
        byte[] Eans=e.encFun("mahesh@1234");
        System.out.println("EncFun Ans:-"+Eans);

        String Dans=e.deFun(Eans);
        System.out.println("DncFunc Ans:-"+Dans);
    }
}
