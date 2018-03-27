package rim.superkeyword;

class Parent1Class{


	void display(){

		System.out.println("The method of the parent class");
	}
}

class Subclass extends Parent1Class{

	void display(){

		System.out.println("The method of the derived , child or subclass");
	}

	void print(){

		display();

		super.display();
	}


	public static void main(String[] args) {
		Subclass sc=new Subclass();

		sc.print();

	}
}