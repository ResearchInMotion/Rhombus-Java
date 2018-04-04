package com.StringHandling;

public class BooleanEndsWith {
	
	public static void main(String[] args) {
		
		
		String name="Sahil nagpAL";
		String name2="SAHIL nAGPal";
		boolean val2=name.equalsIgnoreCase(name2);
		
		Boolean val=name.endsWith("al");
		System.out.println(val);
		System.out.println(val2);
		
		
	}

}
