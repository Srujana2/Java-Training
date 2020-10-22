package com.nttdata.Inheritance;

public class Engine {

	String engineType;
	int engineModel;

	public Engine(String engineType, int engineModel) {
	super();
	this.engineType = engineType;
	this.engineModel = engineModel;
	}

	public void engineDisplay()
	{
	System.out.println("Engine Type:"+engineType+"\t Engine Model:"+engineModel);
	}


	}
	

