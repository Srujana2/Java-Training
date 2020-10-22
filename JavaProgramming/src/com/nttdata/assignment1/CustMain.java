package com.nttdata.assignment1;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CustMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Encoder encoder=Base64.getEncoder();
		HashMap<Integer,Customer> hm=new HashMap<Integer,Customer>();
		hm.put(1,new Customer(11,"Srujana",encoder.encodeToString("abc".getBytes()),25000,"Hyd"));
		hm.put(2,new Customer(16,"Indu",encoder.encodeToString("dfg".getBytes()),23000,"Hyd"));
		hm.put(3,new Customer(12,"Keerthu",encoder.encodeToString("csk".getBytes()),12000,"Hyd"));
		hm.put(4,new Customer(14,"Sravya",encoder.encodeToString("rcb".getBytes()),14000,"Hyd"));
		hm.put(5,new Customer(17,"Mouni",encoder.encodeToString("ddr".getBytes()),15000,"Hyd"));
		hm.put(6,new Customer(89,"Priya",encoder.encodeToString("srh".getBytes()),13000,"Hyd"));
		hm.put(7,new Customer(90,"Rahul",encoder.encodeToString("lkj".getBytes()),16000,"Hyd"));
		hm.put(8,new Customer(97,"Abi",encoder.encodeToString("qwe".getBytes()),24000,"Chennai"));
		hm.put(9,new Customer(87,"Akhil",encoder.encodeToString("wer".getBytes()),3000,"Hyd"));
		hm.put(10,new Customer(77,"Monal",encoder.encodeToString("jkl".getBytes()),34000,"Hyd"));
		hm.put(11,new Customer(45,"Rupa",encoder.encodeToString("ddq".getBytes()),36000,"Banglore"));
		hm.put(12,new Customer(23,"Neeru",encoder.encodeToString("dcr".getBytes()),12000,"Hyd"));
		hm.put(13,new Customer(13,"Rashmi",encoder.encodeToString("rrr".getBytes()),15000,"Hyd"));
		hm.put(14,new Customer(18,"Ravi",encoder.encodeToString("kkr".getBytes()),18000,"Hyd"));
		hm.put(15,new Customer(19,"Kiran",encoder.encodeToString("kxp".getBytes()),29000,"Hyd"));
		hm.put(16,new Customer(91,"karthik",encoder.encodeToString("lyt".getBytes()),40000,"Hyd"));
		hm.put(17,new Customer(98,"Harsha",encoder.encodeToString("pqr".getBytes()),45000,"Hyd"));
		hm.put(18,new Customer(24,"Vikram",encoder.encodeToString("rsd".getBytes()),50000,"Hyd"));
		hm.put(19,new Customer(25,"Vicky",encoder.encodeToString("prk".getBytes()),54000,"Hyd"));
		hm.put(20,new Customer(99,"Lucky",encoder.encodeToString("trs".getBytes()),80000,"Hyd"));
		
		List l1=hm.entrySet().stream().filter(p1->p1.getValue().city.equalsIgnoreCase("Hyd")).map(p1->p1.getValue()).collect(Collectors.toList());		
		System.out.println(l1);
		
		long count=l1.stream().count();
		System.out.println(count);
		
		
		Entry<Integer,Customer> max=hm.entrySet().stream().max((p1,p2)->p1.getValue().totalprice > p2.getValue().totalprice ? 1:-1).get();
		
		System.out.println(max);
		
		Entry<Integer,Customer> min=hm.entrySet().stream().min((p1,p2)->p1.getValue().totalprice > p2.getValue().totalprice ? 1:-1).get();
		
		System.out.println(min);

	}
}
