package com.nttdata.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee=new Employee(10,"Srujana",20);
		String fileName="abc.txt";
		try
		{
			FileOutputStream fout=new FileOutputStream(fileName);
			ObjectOutputStream o1=new ObjectOutputStream(fout);
			o1.writeObject(employee);
			o1.close();
			fout.close();
			System.out.println("Object has been serialized "+"Data before Deserialization");
		employee.print(employee);
		
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		employee=null;
		
		FileInputStream fin;
		try
		{
			fin=new FileInputStream(fileName);
				ObjectInputStream in=new ObjectInputStream(fin);
	employee=(Employee)in.readObject();
	in.close();
	fin.close();
			} catch (IOException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		
		}
	}