//Java HashSet from another Collection
import java.util.*;
class HashSetExample4{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
			list.add("Mahesh");
			list.add("Gaurav");
			list.add("Alekh");

		HashSet<String> set=new HashSet<String>(list);
			set.add("Yash");

			Iterator itr=set.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}

	}
}