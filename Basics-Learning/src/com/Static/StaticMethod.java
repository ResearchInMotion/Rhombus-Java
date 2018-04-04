package com.Static;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;

public class StaticMethod {
	
	
	
	
	static int addition(int a , int b ){
		
		
		int c;
		c=a+b;
		
		System.out.println(c);
		return c;
		
	}
	
	public static void main(String[] args) {
		
		
		final Logger logger = Logger.getLogger(StaticMethod.class);
		Logger.getLogger("prg").setLevel(Level.ALL);

		
		
		logger.info("Addition");
		
		
		System.out.println(addition(45, 67));
		addition(45, 2);
		
	}

}
