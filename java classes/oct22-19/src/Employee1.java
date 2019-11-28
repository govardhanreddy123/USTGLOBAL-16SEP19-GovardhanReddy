
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
		System.out.println(name+"  "+eid);
		
	}
	void display() {
		System.out.println("employee name is "+name);
		System.out.println("employee id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello "+name+" weilcome to ust global company");
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("deepika",123);
		Employee1 e2 = new Employee1("alia",456);
		Employee1 e3 = new Employee1("priya",789);
		e1.display();
		e2.display();
		e3.display();
		
	}

}
