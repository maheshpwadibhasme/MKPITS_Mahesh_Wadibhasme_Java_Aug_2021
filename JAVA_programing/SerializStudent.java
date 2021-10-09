//java.io.Serializable interface

import java.io.*;
public class SerializStudent implements Serializable{
	int id;
	String name;

	public SerializStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
}