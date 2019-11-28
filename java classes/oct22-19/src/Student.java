
public class Student {
	String name;
	int id;
	String branch;
	long phno;
	String clg;
	Student(String name,int id,String branch,long phno,String clg){
		this.name = name;
		this.id = id;
		this.branch= branch;
		this.phno=phno;
		this.clg = clg;
	}
	void dispaly() {
		System.out.println("student name ,id ,brnach,phno,clg is  "+name+" "+id+" "+branch+" "+phno+" "+clg);
	}
public static void main(String[] args) {
	
	Student s1 = new Student("raju",121,"cse",779983825,"ksrm");
	Student s2 = new Student("pavan",122,"eee",779983843,"jntua");
	Student s3 = new Student("guru",123,"ece",879983823,"mits");
	Student s4 = new Student("vinod",124,"mec",979983825,"rgm");
	Student s5 = new Student("govardhan",125,"cse",679983825,"aits");
	Student s6 = new Student("narayana",126,"civil",989983825,"sku");
	Student s7 = new Student("saicharan",127,"cse",969983825,"svu");
	Student s8 = new Student("anji",128,"ece",869983825,"cbit");
	Student s9 = new Student("neetaji",129,"eee",965983825,"geetam");
	Student s10 = new Student("hanuman",130,"cse",876983825,"Srm");
	s1.dispaly();
	s2.dispaly();
	s3.dispaly();
	s4.dispaly();
	s5.dispaly();
	s6.dispaly();
	s7.dispaly();
	s8.dispaly();
	s9.dispaly();
	s10.dispaly();
}
}
