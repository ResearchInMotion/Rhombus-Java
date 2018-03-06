package com.inheritance;

class JavaExample1 {
	
	private String name="Sahil";
	private String age="2";
	
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAge() {
		return age;
	}
	protected void setAge(String age) {
		this.age = age;
	}
	

}

public class JavaExample extends JavaExample1{
	
	String name2="Nikki";
	
	public static void main(String[] args) {
		
		JavaExample je=new JavaExample();
		System.out.println("The subject is "+je.name2);
		System.out.println("The name is "+je.getName());
		System.out.println("The age is "+je.getAge());
		
	}
}
