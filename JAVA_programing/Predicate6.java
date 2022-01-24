
import java.util.function.Predicate;

public class Predicate6 {
    public static void main(String[] args) {
        //lambda exp
        Predicate<Integer> predicate1=ar->ar>5;
        Predicate<Integer> negate=predicate1.negate();
        Boolean test =negate.test(3);
        System.out.println(test);
    }


}
