package org.abstraction;

public class AbsPart extends Partially {

	@Override
	public void Mark() {
		System.out.println("Mark");
		
	}
	public static void main(String[] args) {
		AbsPart s = new AbsPart();
		s.Login();
		s.Test();
		s.Mark();
		
	}

}
