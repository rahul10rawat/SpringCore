package org.rahul.springcore;

public class Car {

	String name;
	Engine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarDetails()
	{
			System.out.println("name : " +name + " , engine name : "+engine.getName() + " , engine power : "+engine.getPower());
		
	}
	

}
