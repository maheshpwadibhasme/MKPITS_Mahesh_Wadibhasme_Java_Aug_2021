import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        Optional<String> ob2=Optional.of(s[0]);
        System.out.println(ob2);
    }
}