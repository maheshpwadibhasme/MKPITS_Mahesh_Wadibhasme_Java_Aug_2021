
import java.util.*;
import java.util.stream.Collectors;

public class ArrayList8lamb3 {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ArrayList<Integer> ob2 = new ArrayList<Integer>();

        ob.add(30);
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(40);
        ob.add(5);
        System.out.println(ob);

        List<Integer> ct=ob.stream().map(e->e+5).collect(Collectors.toList());
        System.out.println(ct);
    }
}

