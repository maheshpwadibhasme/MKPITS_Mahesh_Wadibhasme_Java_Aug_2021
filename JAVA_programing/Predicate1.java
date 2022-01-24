import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
    }
}
