package org.abstraction;

public class AbsFully implements FullyAbs {

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

	@Override
	public void mul() {
		System.out.println("mul");
		
	}
	public static void main(String[] args) {
		AbsFully a = new AbsFully();
		a.add();
		a.sub();
		a.mul();
		
	}

}
