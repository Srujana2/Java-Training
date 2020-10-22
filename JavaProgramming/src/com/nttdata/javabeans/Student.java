package com.nttdata.javabeans;

public class Student {
	
	private int StudentId;
	private String Studentname;
	private String StudentAddress;
	
	
	
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}



	public Student(int studentId, String studentname, String studentAddress) {
		super();
		StudentId = studentId;
		Studentname = studentname;
		StudentAddress = studentAddress;
	}
	
	public void printMarks(Marks m)
	{
		System.out.println("Marks of student are:");
		System.out.println("Student marks:"+m.getMarks());
		
	}
}
