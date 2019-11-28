
public class Employee {
	String name;
	int eid;
	public Employee(String empname, int empid) {
		name = empname;
		eid = empid;
		System.out.println(name+"  "+eid);
		
	}
	void display() {
		System.out.println("employee name is "+name);
		System.out.println("employee id is "+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("rashmika",143);
		Employee e2 = new Employee("samantha",123);
		Employee e3 = new Employee("chicha",240);
		e1.display();
		e2.display();
		e3.display();
		
	}
}
