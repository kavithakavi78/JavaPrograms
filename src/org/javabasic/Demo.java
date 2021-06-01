package org.javabasic;

import org.inheritance.Single;

public class Demo {
	public void login() {
		System.out.println("Log in");
		
	}
	public static void main(String[] args) {
		//different package
		Demo d = new Demo();
		d.login();
		Single s = new Single();
		s.dotcom();
		
		
	}

}
