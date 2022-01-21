import java.util.Optional;

public class Optional4 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        Optional<String> ob2=Optional.ofNullable(s[0]);
       // System.out.println(ob2.get());
        System.out.println(ob2.isPresent());
        System.out.println(ob2.isEmpty());
        if(ob2.isEmpty()){
            System.out.println("no data");
        }else{
            System.out.println(ob2.get().toUpperCase());
        }
    }
}