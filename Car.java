package com.second.one;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable
{
	String regNumber;
	String model;
	String createdTime;
	static int count=0;
	
	public Car()
	{
		count++;
	}
	public Car(String regNumber,String model,String createdTime)
	{
		count++;
		this.regNumber=regNumber;
		this.model=model;
		this.createdTime=createdTime;
	}
	public String getRegNumber()
	{
		return regNumber;
	}
	public void setRegNumber(String regNumber)
	{
		this.regNumber=regNumber;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}

	@Override
	public int hashCode() 
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) 
	{
		return super.equals(obj);
	}

	@Override
	public String toString() 
	{
		return "Reg.Num:"+regNumber+" Model:"+model+" ManufacturingDate:"+createdTime;
	}
	
	public String getCreatedTime() 
	{
		return createdTime;
	}

	public void setCreatedTime(String createdTime) 
	{
		this.createdTime = createdTime;
	}
	public static String getCounter()
	{
		return "Object Created for: "+count;
	}

}
