package org.javabasic;

import java.util.Scanner;

public class Scaneer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte b = s.nextByte();
		System.out.println(b);
		short s1 = s.nextShort();
		System.out.println(s1);
		int i = s.nextInt();
		System.out.println(i);
		float f = s.nextFloat();
		System.out.println(f);
		double d = s.nextDouble();
		System.out.println(d);
		boolean b1 = s.nextBoolean();
		System.out.println(b1);
		char c = s.next().charAt(0);
		System.out.println(c);
		String s2 = s.nextLine();
		System.out.println(s2);

	}

}
