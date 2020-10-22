package com.nttdata.javabeans;

public class Marks {

	
	private double Marks;

	public Marks(double marks) {
		super();
		this.Marks = marks;
	}


public double getMarks() {
		return Marks;
	}


	public void setMarks(double marks) {
		Marks = marks;
	}


void printStudentDetails(Student s)
{
	System.out.println("Details of students are:");
	System.out.println("StudentId: "+s.getStudentId()+" StudentName: "+s.getStudentname()+" StudentAddress: "+s.getStudentAddress());
	
	
	
}
}