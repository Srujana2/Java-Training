package com.nttdata.abstracts;

import com.nttdata.assignment.Hello;

public class MethodReferenceOperator {

	
static void foo()
{
	System.out.println("Hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hello h=MethodReferenceOperator::foo;
		System.out.println(h);
		h.print();
	}

}
