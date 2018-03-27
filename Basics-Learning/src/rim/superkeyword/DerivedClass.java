//this code shows the usage of the super keyword.
// here we are accessing the data member of the parent class and here the data member are having the same name here
// that is why we are using the super.number here.

package rim.superkeyword;

class BaseClass{
	
	int number=119;
	
}

class DerivedClass extends BaseClass{

	
	int number=110;
	
	void display(){
		
		System.out.println(super.number);
	}
	
	
	public static void main(String[] args) {
		
		DerivedClass dc=new DerivedClass();
		dc.display();
		
		
	}
}