package org.polymorphism;

public class MethodOverloading {
	
	//static binding// compile time polymorphism
	public void add() {
		System.out.println("Def value");
	}

	public void add(int a) {
		System.out.println(a);

	}

	public void add(String a) {
		System.out.println(a);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, String b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(5);
		m.add("kavi");
		m.add(55, 65);
		m.add(26, "vinoth");
	}
}
