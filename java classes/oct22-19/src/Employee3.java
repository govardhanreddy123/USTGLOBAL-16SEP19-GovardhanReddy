
public class Employee3 {
	String name;
	int eid;
	long aadharno;
	Employee3(String name,int eid,long aadharno){
		this.name = name;
		this.eid = eid;
		this.aadharno = aadharno;
		System.out.println(name+"  "+eid+" "+aadharno);
		
	}
	Employee3(String name,int eid){
		this.name = name;
		this.eid = eid;
		System.out.println(name+"  "+eid);
		
	}
	Employee3(int eid,String name){
		this.name = name;
		this.eid = eid;
		System.out.println(eid+"  "+name);
		
	}
	
}
