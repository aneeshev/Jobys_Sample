package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializatonSample {
	
	public static void main(String [] args){
		
		Employee employee = new Employee(1, "Aneesh");
		
		try {
			// Object states
//			employee = new Employee(2, "Vineesh",new Address(1, "KTM"));
			// Serialization
//			SerializatonSample.serialization(employee);
			// Object states changed
//			employee = new Employee(2, "Ajeesh");
			// DeSerialization.
			System.out.println(SerializatonSample.deSerialization());
			// Serialization			
			SerializatonSample.serialization(employee);
			// DeSerialization.			
//			System.out.println(SerializatonSample.deSerialization());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void serialization(Employee employee) throws IOException{
		
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(employee);  
		  out.flush();  
		  System.out.println("success");
	}
	
	public static Employee deSerialization() throws ClassNotFoundException, IOException{
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		return (Employee)in.readObject();  
		  
	}

}
