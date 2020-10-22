package com.nttdata.javabeans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student=new Student(1,"srujana","hyderabad");
		Marks marks=new Marks(98);
		
		marks.printStudentDetails(student);
student.printMarks(marks);
	}

}
