package org.javabasic;

public class ModelProgram {
	//Class is a collection of method and collection of objects
	public void addition() {
		System.out.println("add");
	}
	public void subtractio() {
		System.out.println("Sub");
	}
	public static void main(String[] arg) {
		//object creation
		ModelProgram p = new ModelProgram();
		p.addition();
		p.subtractio();
	}

}
