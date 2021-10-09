//In the example given below, both the classes have a data member speedlimit. We are accessing the data
//member by the reference variable of Parent class which refers to the subclass object. Since we are
//accessing the data member which is not overridden, hence it will access the data member of the Parent class always.
///Rule: Runtime polymorphism can't be achieved by data members.

class Bike {
	int speedlimit=90;

}
class Honda extends Bike{
	int speedlimit=120;

}
class RunTimePolymorphism7{
	public static void main(String[] args){
		Bike b=new Honda();
		System.out.println(b.speedlimit);
	}
}