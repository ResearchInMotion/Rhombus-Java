package com.StringHandling;

public class ReverseOfString {

	public static void main(String[] args) {
		
		
		String name="Sahil";
		String name2="Nikki";
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(name);
		
//		sb.reverse();
		
		
		System.out.println(sb.reverse());
		
		// TODO Auto-generated method stub
		
		
		char[] val=name2.toCharArray();
		
		for(int i=val.length-1;i>=0;i--){
			System.out.print(val[i]);
		}

	}

}
