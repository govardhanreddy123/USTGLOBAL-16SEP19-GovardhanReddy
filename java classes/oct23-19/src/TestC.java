
public class TestC {

	public static void main(String[] args) {
		Superclass sup = new Superclass();
		sup.add();
		sup.count();
		System.out.println("===============================");
		SubClass s = new SubClass();
		s.add();
		s.count();
	}
}
