package org.inheritance;

public class Hierarchical extends Hierarch {
	// more than one child class and one parent class
	
	public void adding() {
		System.out.println("Add");

	}
	public static void main(String[] args) {
		Hierarchical h1 = new Hierarchical();
		h1.adding();
		h1.acestothree();
		
	}

}
