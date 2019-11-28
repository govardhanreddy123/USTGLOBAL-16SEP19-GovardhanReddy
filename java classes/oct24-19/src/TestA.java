
public class TestA {
	static int a;
	static {
		a=10;
		System.out.println("static block1");
	}
	
	TestA(){
		System.out.println("testA() constructor");
	}
	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value "+a);
		
	}
	static {
		a=20;
		System.out.println("static block2");
	}
	static {
		a=30;
		System.out.println("static block3");
	}
	
	
	
	

}
