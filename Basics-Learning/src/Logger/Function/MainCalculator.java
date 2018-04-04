package Logger.Function;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class MainCalculator {
	
	
	Logger log=Logger.getLogger(MainCalculator.class);
	
	
	
	int Addition() throws InterruptedException{
		
		
		
		log.info("Invoking the Addition Method");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number 1");
		
		int number1=scn.nextInt();
		
		System.out.println("Please enter the number 2");
		
		int number2=scn.nextInt();
		
		int number3=number1+number2;
		
		return number3;
		}
	
	
	
	
	int Subtract() throws InterruptedException{
		
		
		
		log.info("Invoking the Subtract Method");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number 1");
		
		int number1=scn.nextInt();
		
		System.out.println("Please enter the number 2");
		
		int number2=scn.nextInt();
		
		int number3=number1-number2;
		
		return number3;
		}
	
	
	int Multiplication(){
		
		log.info("Invoking the Multiplication Method");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number 1");
		
		int number1=scn.nextInt();
		
		System.out.println("Please enter the number 2");
		
		int number2=scn.nextInt();
		
		int number3=number1*number2;
		
		return number3;
		}

}
