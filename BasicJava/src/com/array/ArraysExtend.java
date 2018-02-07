package com.array;

public class ArraysExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr=new String[] {"A","B","C"};
		
		String[] extend=new String[5];
		
		extend[3]="E";
		extend[4]="F";
		
		System.arraycopy(arr, 0, extend, 0, arr.length);
		
		for(String str:extend) {
			System.out.println(str);
		}
		
		
		
	}

}
