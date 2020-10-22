package com.nttdata.assignment;

import java.util.function.Function;
import java.util.function.Predicate;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="Anu";
		Greeting g1=(s1)->{System.out.println(s1+" Hello good morning");};
		g1.greet(s);
		
		String s1="Tanu";
		Greeting g2=(s2)->{System.out.println(s2+" Hello Good Morning");};
		g2.greet(s1);*/
	
	Predicate<Integer> p=I->(I>20);
	System.out.println("Predicate:"+p.test(10));
	Predicate<String> s1=s->(s.length()>4);
	System.out.println(s1.test("H"));
	
	Function<String,Integer> s2=s->s.length();
	System.out.println(s2.apply("Hi"));
	System.out.println(s2.apply("good morning"));
	}
	
	}


