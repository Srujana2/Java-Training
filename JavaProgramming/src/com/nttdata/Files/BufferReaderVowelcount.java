package com.nttdata.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderVowelcount {

	
	void writeToFile()
	{
		try
		{
			BufferedWriter b=new BufferedWriter(new FileWriter("C:\\\\SRUJANA\\\\new1\\abc1.txt"));
			b.write("Hello how are you srujana");
			b.close();
			System.out.println("File written Successfully");
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
			BufferedReader br=new BufferedReader(new FileReader("C:\\\\SRUJANA\\\\new1\\abc1.txt"));
			int count=0;
			String str=br.readLine().toLowerCase();
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
			}
			}
			System.out.println("No of vowels in:\n"+str+"\n"+count);
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferReaderVowelcount b3=new BufferReaderVowelcount();
		b3.writeToFile();
		b3.readFromFile();
	}
}
