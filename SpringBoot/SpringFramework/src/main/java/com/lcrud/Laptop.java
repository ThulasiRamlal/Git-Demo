package com.lcrud;

public class Laptop {
	OS os;
	
	public Laptop(OS os)
	{
		this.os=os;
	}
	
	public void build()
	{
		os.operate();
		System.out.println("Build method in Laptop class executed....");
	}
	

}
