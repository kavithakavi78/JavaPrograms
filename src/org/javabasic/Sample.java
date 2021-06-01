package org.javabasic;

public class Sample {
	public void stuId() {
		System.out.println("stuId");

	}
	public void stuName() {
		System.out.println("stuName");

	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.stuId();
		s.stuName();
		//same package different class
		ModelProgram p = new ModelProgram();
		p.addition();
	}

}
