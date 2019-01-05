package com.training.java.core.enums;

public enum State
{
	MICHIGAN("MI", "Michigan"),
	OHIO("OH", "Ohio");
	
	private String stateCode;
	private String stateDesc;
	
	private State(String _stateCode, String _stateDesc)
	{
		stateCode = _stateCode;
		stateDesc = _stateDesc;
	}
	
	public String getStateCode()
	{
		return stateCode;
	}
	
	public String getStateDescription()
	{
		return stateDesc;
	}
}
