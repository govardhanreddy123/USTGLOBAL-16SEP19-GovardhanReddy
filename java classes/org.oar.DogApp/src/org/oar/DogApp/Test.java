package org.oar.DogApp;

public class Test {

	public static void main(String[] args)
	{
		try {
			Class.forName("org.oar.DogApp.Dog");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
