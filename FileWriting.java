package com.second.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

public class FileWriting 
{
	public static void main(String[] args) throws InterruptedException 
	{
		File folder=new File("FileDemo");
		if(!folder.exists())
			folder.mkdir();
		String source="FileDemo/sampleFile.txt";
		 Date date = new Date();
		 long timeMilliBefore = date.getTime();
		 LocalTime timeMilliBef=java.time.LocalTime.now();
		 System.out.println("Current Time: "+java.time.LocalTime.now());
		try 
		{
			FileWriter fw = new FileWriter(source);
			BufferedWriter bw=new BufferedWriter(fw,2000);
			bw.write("hello all... ");
			bw.write("\n");
			bw.write("good morning warn");
			bw.write("\n");
			bw.write("how are you?");
			bw.write("\n");
			bw.write("there is a error in this program");
			bw.write("\n");
			bw.write("fatel issue is happened");
			bw.write("\n");
			bw.close();
			System.out.println("Data saved");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		String des="FileDemo/sampleFile.txt";
		try 
		{       
	      FileReader fr=new FileReader(des);        
	      BufferedReader br=new BufferedReader(fr);  
	      FileWriter fw= new FileWriter("sampleFileCopy.txt");      
	      String s=null;
	      while((s=br.readLine())!=null)           
	      {
	    	 if(s.contains("warn") || s.contains("error") || s.contains("fatel"))
	    	 {
	         fw.write(s);
	         fw.write("\n");
	         fw.flush();
	    	 }
	      }
		  fr.close();
		  fw.close();
		  System.out.println("Done");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Thread.sleep(100000);
		long timeMilliAfter = date.getTime();
		long timeTaken=timeMilliAfter-timeMilliBefore;
		System.out.println("Source Path:"+source);
		System.out.println("Destination Path:"+des);
		System.out.println("Starts at:"+timeMilliBefore);
		System.out.println("Ends at:"+timeMilliAfter);
		System.out.println("Time taken:"+timeTaken);
	
}}
