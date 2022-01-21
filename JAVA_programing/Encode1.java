import java.util.Base64;

class EncDec1{
    byte[] encfun(String name){
        byte[] encode= Base64.getEncoder().encode(name.getBytes());
        return encode;
    }
     String decfun(byte[] encodedata){
        byte[] decode=Base64.getDecoder().decode(encodedata);
        return new String(decode);
    }
}
public class Encode1 {
    public static void main(String[] args) {
        String pass="mahesh@1234";
         EncDec1 ob=new EncDec1();
        byte[] encfun = ob.encfun(pass);
        String decfun = ob.decfun(encfun);
        System.out.println(decfun);
        System.out.println(encfun);

//        byte[] encode= Base64.getEncoder().encode(pass.getBytes());
//        System.out.println(encode);
//
//        byte[] decode=Base64.getDecoder().decode(encode);
//        System.out.println(new String(decode));

    }
}
