package com.nttdata.Files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	
	void writeToFile()
	{
		try
		{
			FileOutputStream out=new FileOutputStream("C:\\SRUJANA\\new1\\abc.txt");
			out.write(70);
			//out.close();
			System.out.println("file is written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStreamExample f=new FileOutputStreamExample();
		f.writeToFile();
	}

}
