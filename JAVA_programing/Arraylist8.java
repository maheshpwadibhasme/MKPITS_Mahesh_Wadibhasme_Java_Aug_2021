import java.util.ArrayList;

public class Arraylist8 {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ArrayList<Integer> ob2=new ArrayList<Integer>();
        ob.add(30);
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(40);
        ob.add(5);

        for(Integer integer:ob){
            if(integer%2==0){
                ob2.add(integer);
            }
        }
        System.out.println("even no in a array list:- "+ob2);

    }
}
