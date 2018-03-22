package com.polymorphism;



class bank{
	
float getrateofinterest(){
	
	return (0);
}

}

class SBI extends bank{
	
	float getrateofinterest(){
		return (0.9f);
	}
}

class BankofBaroda extends SBI{
	
	float getrateofinterest(){
		
		return(0.8f);
	}
}

class PNB extends BankofBaroda{
	
	float getrateofinterest(){
		
		return(0.7f);
	}
}

class TestPolymorphism{
	
	public static void main(String[] args) {
		
		bank ba=new bank();
		System.out.println(ba.getrateofinterest());
		
	}
	
	
	
	
}
