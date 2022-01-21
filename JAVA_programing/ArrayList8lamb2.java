import java.util.ArrayList;

public class ArrayList8lamb2 {
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

        for(Integer integer:ob){
            ob2.add(integer+5);
        }
        System.out.println(ob2);
    }
}
