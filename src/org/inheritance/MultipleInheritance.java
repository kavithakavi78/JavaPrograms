package org.inheritance;

public class MultipleInheritance implements MultipleInh, MultInh {

	@Override
	public void three() {
		System.out.println("three");

	}

	@Override
	public void four() {
		System.out.println("four");

	}

	@Override
	public void one() {
		System.out.println("one");

	}

	@Override
	public void two() {
		System.out.println("two");

	}

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.one();
		m.three();
		m.two();
		m.four();

	}

}
