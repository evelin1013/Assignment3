package com.second.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserialize {

	public static void main(String[] args) 
	{
		String fileName="CarObj.txt";
	
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Car c=(Car) ois.readObject();
			Car c1=(Car) ois.readObject();
			System.out.println(c1);
			System.out.println(c);
			
		} 
		catch (ClassNotFoundException | IOException e) 
		{
			e.printStackTrace();
		}
	

	}

}
