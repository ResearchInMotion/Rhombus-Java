package com.StringHandling;


/// also used to set the bytes like UTF-8 and win-1252 of a string

public class Bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Sahil";
		byte[] val=name.getBytes();
		
		System.out.println(val);

	}

}
