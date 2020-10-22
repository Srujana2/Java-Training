package com.nttdata.Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	
	void writeToFile()
	{
		try
		{
			FileWriter w=new FileWriter("C://SRUJANA//new1/abc.txt");
			w.write("hello");
		//System.out.println("File is created!!!");
w.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	void readFromFile()
	{
		try
		{
			FileReader fr=new FileReader("C:\\SRUJANA\\new1\\abc.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			//fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileWriterExample f=new FileWriterExample();
f.writeToFile();
//f.readFromFile();
	}

}
