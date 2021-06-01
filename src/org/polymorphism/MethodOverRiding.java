package org.polymorphism;

public class MethodOverRiding extends MethodOver{
	@Override
	public void add() {
		System.out.println("add");
		
	}
	public void add(String a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverRiding r=new MethodOverRiding();
		r.add();
		r.add(55);
		r.add("Jesus");
		r.add("kavi", 65);
		
	}

}
