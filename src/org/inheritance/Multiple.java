package org.inheritance;

public class Multiple extends MultilevelIn {
	//more than one parent class and one child class supported into tree level structure
	public void add() {
	System.out.println("add");
	}
	public void sub() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.add();
		m.sub();
		m.multi();
		m.div();
	}

}
