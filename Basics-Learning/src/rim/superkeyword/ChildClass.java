// This class does not use the super keyword, thats basically tells about the use of the parent and child class.


package rim.superkeyword;

class ParentClass{

	int num=100;

}

class ChildClass extends ParentClass{

	int num=110;

	void display(){


		System.out.println("The value of number is "+num);
	}


	public static void main(String[] args) {

		ChildClass cc=new ChildClass();
		cc.display();


	}

}