package com.training.java.core.jdk15.two;

public enum State {
	
	MICHIGAN("Michigan", "MI"),
	OHIO("Ohio", "OH"),
	VIRGINIA("Virginia", "VA"),
	DC("DC", "DC"),
	TEXAS("Texas", "TX");
	
	private String name;
	private String stateCode;
	private State(String name, String stateCode)
	{
		this.name = name;
		this.stateCode = stateCode;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getStateCode()
	{
		return stateCode;
	}
}
