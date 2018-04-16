package com.ExceptionHandling;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TryCatchException {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		
	
		Logger log=Logger.getLogger(TryCatchException.class);
		
		log.info("The try starts from here");
		
		try{
		
		int[] val=new int[5];
		val[6]=90;
		
		
		// TODO Auto-generated method stub
		
		}
		
		catch(Exception e){
			
			log.info("The catch starts from here ");
			
			System.out.println("The exception is here now");
		}

	}

}
