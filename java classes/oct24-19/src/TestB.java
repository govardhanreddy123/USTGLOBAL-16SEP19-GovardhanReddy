
public class TestB {
     static int b;
     int a;
	
	{
		a =10;
		b= 20;
		System.out.println("non staticblock1");
	}
	TestB(){
		System.out.println("testA() constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		TestB t = new TestB();
		TestB t1 = new TestB();
		System.out.println("a value "+t.a);
		System.out.println("main  ends");
		
	}
	{
		System.out.println("non staticblock2");
	}
	
	
	
	
	

}
