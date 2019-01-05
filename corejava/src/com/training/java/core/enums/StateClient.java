package com.training.java.core.enums;

public class StateClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		StateScribe sc = new StateScribe();
		String desc = sc.getDesc(State.OHIO);
		System.out.println("Description = " + desc);
	}

}
