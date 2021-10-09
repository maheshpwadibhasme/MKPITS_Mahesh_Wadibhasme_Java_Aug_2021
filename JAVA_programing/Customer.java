import java.io.*;
public class Customer implements Serializable{
	String name;
	String email;
	public Customer(String name,String email){
	this.name=name;
	this.email=email;
	}
}