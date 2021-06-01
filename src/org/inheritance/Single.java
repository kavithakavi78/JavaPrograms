package org.inheritance;

public class Single extends SingleInher{
	//To inherit one class properties into anthoer class is called inheritance
	public void dotcom() {
		System.out.println("Digital");
	}
	public void Telesale() {
		System.out.println("Tel");
		
	}
	public static void main(String[] args) {
		Single s = new Single();
		s.dotcom();
		s.Telesale();
		//Combination of one parent class and one child class
		s.retail();
	}

}
