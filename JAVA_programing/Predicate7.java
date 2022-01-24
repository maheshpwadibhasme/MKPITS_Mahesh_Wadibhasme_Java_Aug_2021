import java.util.function.Predicate;

public class Predicate7 {
    static boolean checksingledigit(int a, Predicate<Integer>predicate1){
        return predicate1.test(a);
    }
    public static void main(String[] args) {
        boolean checksingledigit=checksingledigit(22,c->c<10);
        System.out.println(checksingledigit);
    }
}
