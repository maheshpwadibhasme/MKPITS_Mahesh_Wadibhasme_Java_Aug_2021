import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
        //lambda exp
        Predicate <Integer>Predicate2=ar->ar>100;
        boolean test=Predicate2.test(200);
        System.out.println(test);
    }
}
