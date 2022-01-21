import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        Optional<String> ob2=Optional.ofNullable(s[0]);
        System.out.println(ob2.get());
    }
}