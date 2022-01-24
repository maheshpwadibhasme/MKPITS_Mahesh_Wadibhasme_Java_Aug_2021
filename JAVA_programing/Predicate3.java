import java.util.function.Predicate;

public class Predicate3 {
    public static void main(String[] args) {
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
        Boolean test=predicate.test(200);
        System.out.println(test);
    }
}
