import java.util.function.Predicate;

public class Predicate5 {
    public static void main(String[] args) {
        //lambda exp
        Predicate<Integer> predicate1=ar->ar>100;
        Predicate<Integer> predicate2=ar->ar<200;
        Predicate<Integer> or=predicate1.or(predicate2);

        Boolean test=or.test(180);
        System.out.println(test);
    }
}
