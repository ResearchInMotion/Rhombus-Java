package company.constructor;

public class twoparameterizedconstructor {
	
	int var;
	
	public twoparameterizedconstructor() {
		// TODO Auto-generated constructor stub
		
		this.var=10;
		
		
	}
	
	public twoparameterizedconstructor(int val){
		
		
		this.var=val;
		
		
		
	}
	
	public int info() {
		
		return var;
		
	}
	
	public static void main(String args[]) {
		
		twoparameterizedconstructor tr=new twoparameterizedconstructor();
		twoparameterizedconstructor tr2=new twoparameterizedconstructor(100);
		System.out.println("var is: "+tr.info());
        System.out.println("var is: "+tr2.info());
	
	}
	

}
