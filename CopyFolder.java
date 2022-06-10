package com.second.one;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFolder
{
	public static void main(String[] args)
	{
		Path sourceDirectory = Paths.get("/home/vastpro/first/two");
        Path targetDirectory = Paths.get("/home/vastpro/firstNewCopy/two.txt");
        try
        {
			Files.copy(sourceDirectory, targetDirectory);
			System.out.println("Sucess");
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
	}
	
}

	
