package com.nttdata.Inheritance;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer cp=new Computer("dell",89000,"white",new MotherBoard(5),"intel i core");
		Laptop lp=new Laptop("lenovo",5000,"red",new MotherBoard(0),"intel q core");
		cp.display();
		lp.display();
	}

}
