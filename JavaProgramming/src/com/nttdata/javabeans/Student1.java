package com.nttdata.javabeans;

public class Student1 implements MarksDao{

	
String Studentname;
	
	
	public Student1(String Studentname)
	{
		super();
		this.Studentname=Studentname;
		
	}
	public void setMarks(Marks marks) {
		// TODO Auto-generated method stub
		
		System.out.println("Marks of Student "+Studentname+" is ");
		System.out.println("Marks is: "+marks.getMarks());
	}
	
	

}
