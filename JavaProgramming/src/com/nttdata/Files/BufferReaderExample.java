package com.nttdata.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {

	//private static final BufferReader BufferReaderExample = null;
	public static  void process(String str)
	{
		System.out.println("Processing...."+str+"\n");
	}
	
	void ReadFromFile()
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String line="";
	while(!(line.equalsIgnoreCase("quit"))&&!line.equalsIgnoreCase("exit"))
	{
		System.out.println("Enter ........");
		try
		{
			line=bf.readLine();
			BufferReaderExample.process(line);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferReaderExample b=new BufferReaderExample();
b.ReadFromFile();
	}

	}

