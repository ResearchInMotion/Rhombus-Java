package rim.Association;

class carname{
	
	String carname;
	int carid;
	
	carname(String carn,int id){
		
		this.carname=carn;
		this.carid=id;
		
	}
}
	
class drivername extends carname{
	
	String drivername;

	drivername(String name,String cname,int cid){
		
		super(cname,cid);
		this.drivername=name;
		
	}
}

 class Transport{
	
	public static void main(String[] args) {
		
		drivername dn=new drivername("Sahil", "Ford", 2);
		
		System.out.println(dn);
		
	}
}
	

