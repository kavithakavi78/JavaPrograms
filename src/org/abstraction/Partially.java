package org.abstraction;

public abstract class Partially {
	//non abstract method
	public void Login() {
		System.out.println("Login");
	}

	public void Test() {
		System.out.println("Test");
	}
	//abstract method

	public abstract void Mark();

}
