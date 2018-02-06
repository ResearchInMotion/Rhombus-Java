package company.constructor;

public class ParameterizedConstructor {
	int roll_no;
	String name;
	
	public ParameterizedConstructor(int rollno , String name) {
		
		
		this.roll_no=rollno;
		this.name=name;
		
	
		// TODO Auto-generated constructor stub
	}
	
	void info(){
	
	System.out.println("employee roll no : "+roll_no +" "+ "employee name : "+name);
}
	
	public static void main(String args[]) {
		
		ParameterizedConstructor pr=new ParameterizedConstructor(123, "sahil");
		ParameterizedConstructor pr2=new ParameterizedConstructor(456, "rachit");
		pr.info();
		pr2.info();
		
	}

}
