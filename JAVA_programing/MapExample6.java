//Java Map Example: comparingByValue() in Descending Order
import java.util.*;
class MapExample6{
	public static void main(String[] args){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
			map.put(1,"mahesh");
			map.put(2,"gaurav");
			map.put(3,"Alekh");

			map.entrySet()

			.stream()

			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))

			.forEach(System.out::println);
	}
}