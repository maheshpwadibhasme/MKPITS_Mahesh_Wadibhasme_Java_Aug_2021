import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int num[]={22,89,1,32,19,5};

        //parallel sort method for sorting int array
        Arrays.parallelSort(num,1,5);

        for(int x:num){
            System.out.println(x);
        }
        //converting the array to stream and displaying using for each loop
        //Arrays.stream(num).forEach(n->System.out.println(n+""));
    }
}
