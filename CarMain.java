package com.second.one;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarMain {

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.setRegNumber("TN-DE-1013");
		c.setModel("Benz-series-7");
		//c.setCreatedTime("05.05.2022");
		//System.out.println(c);
		Car c2=new Car("TN-10-1013","BMW",null);		
		//System.out.println(c2);
		Car c3=new Car("TN-13-1013","AUDI",null);
		//System.out.println(c3);
		System.out.println(Car.getCounter());
		String fileName="CarObj.txt";
	
		try 
		{
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.writeObject(c2);
			oos.writeObject(c3);
			oos.close();
			fos.close();
			System.out.println("Obj stored to disk");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
