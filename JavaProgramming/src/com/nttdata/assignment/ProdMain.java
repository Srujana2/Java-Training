package com.nttdata.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product>list=new HashSet<>();
		list.add(new Product(20,"Mobile",20000));
		list.add(new Product(10,"Laptop",15000));
		list.add(new Product(15,"Fan",12000));
		list.add(new Product(12,"Sugar",11000));
		list.add(new Product(13,"Table",17000));
		
		//List<Double> listD=new ArrayList<>();
		//withoutstreams
		/*for(Product p:list)
		{
			if(p.price<100000)
			{
				listD.add(p.price);
			}
		}
		System.out.println(listD);
		*/
		
		//with streams
		Set<Double>d=list.stream().filter(p->p.price<100000).map(p->p.price).collect(Collectors.toSet());
		System.out.println(d);
	}

}
