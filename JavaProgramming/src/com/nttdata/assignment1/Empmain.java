package com.nttdata.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1,"Srujana",25000,"Hyderabad"));
		list.add(new Employee(2,"Indu",30000,"Hyderabad"));
		list.add(new Employee(3,"Mounika",28000,"Banglore"));
		list.add(new Employee(4,"Keerthana",12000,"Hyderabad"));
		list.add(new Employee(5,"Rahul",15000,"Chennai"));
		list.add(new Employee(6,"Akhil",40000,"Hyderabad"));
		list.add(new Employee(7,"Monal",18000,"Pune"));
		list.add(new Employee(8,"Dheeraj",16000,"Hyderabad"));
		list.add(new Employee(9,"Rashmi",13000,"Kerala"));
		list.add(new Employee(10,"Ravi",29000,"Hyderabad"));

		System.out.println("No of employees salary between 10000 and 15000 are:");
		list.stream().filter(p->(p.salary>10000 && p.salary<20000)).forEach(p->System.out.println(p.salary+(p.salary*5/100)));
	System.out.println("No of employees at particular location:");
double c1=list.stream().filter(p->p.location.equals("Banglore")).count();
	System.out.println(c1);
		
		System.out.println("total salary of employees:");
	Double d=list.stream().map(p->p.salary).reduce(0.0,(sum,salary)->(sum+salary));
	System.out.println(d);
	
	}

}
