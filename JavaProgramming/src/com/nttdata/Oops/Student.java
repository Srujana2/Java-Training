package com.nttdata.Oops;

import java.util.Scanner;

public class Student {

	int studentId;
	String studentName;
	String studentAddress;
	double studentmarks;
	
	
	public Student()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.println("Enter student id:");
		studentId=s1.nextInt();
		studentName=s1.next();
		studentAddress=s1.next();
		studentmarks=s1.nextDouble();
		
	}
	void display()
	{
		System.out.println("The details of the students:");
		System.out.println("StudentId: "+studentId+" StudentName: "+studentName+" studentAddress: "+studentAddress+" studenttMarks: "+studentmarks);
		
	}
	
}
