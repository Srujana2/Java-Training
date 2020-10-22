package com.nttdata.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list=new ArrayList<>();
		list.add(new Employee(12,"Anu","Hyderabad"));
		list.add(new Employee(13,"Tanu","Banglore"));
		list.add(new Employee(15,"Manu","Mysore"));
		list.add(new Employee(23,"Sanu","Bagalkot"));
		System.out.println("Forward Direction");
		ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Backward direction");
		System.out.println("_____________________________________________");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
