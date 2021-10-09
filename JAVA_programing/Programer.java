class Employee{
	float salary=50000;
}
class Programer extends Employee{
	int bonus=5000;
	public static void main(String[] args){
	Programer p=new Programer();
	System.out.println("Programer Salary ="+p.salary);
	System.out.println("Bonus Of Programer ="+p.bonus);
	}
}