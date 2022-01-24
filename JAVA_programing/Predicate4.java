import java.util.function.Predicate;

public class Predicate4 {
    public static void main(String[] args) {
        //lambda exp
        Predicate<Integer> predicate1=ar->ar>100;
        Predicate<Integer> predicate2=ar->ar<200;
        Predicate<Integer> and=predicate1.and(predicate2);

        Boolean test=and.test(180);
        System.out.println(test);
    }
}
