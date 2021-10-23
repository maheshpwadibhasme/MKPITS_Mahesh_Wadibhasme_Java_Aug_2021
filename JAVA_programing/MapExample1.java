//Java Map Example: Non-Generic (Old Style)
//Non-generic

import java.util.*;
class MapExample1{
public static void main(String[] args){
	Map map=new HashMap();

	//Adding elements to map
	map.put(1,"Amit");
	map.put(5,"Rahul");
	map.put(2,"jai");
	map.put(6,"Amit");

	//Traversing map
	Set set=map.entrySet();//Converting to Set so that we can traverse

	Iterator itr=set.iterator();
	while(itr.hasNext()){
		//Converting to Map.Entry so that we can get key and value separately
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}