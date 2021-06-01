package org.constructor;

public class Argument {
	public Argument() {
		this(5);
		System.out.println("Def");
	}

	public Argument(int a) {
		this("kavi");
		System.out.println(a);
	}

	public Argument(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Argument a = new Argument();
		// Argument a1 = new Argument(55);
		// Argument a2 = new Argument("Kavi");

	}

}
