package org.string;

public class StringSam {
	public static void main(String[] args) {
		System.out.println("Literal String");
		String s1 = "kavitha";
		String s2 = "kavitha";
		System.out.println(s1);
		System.out.println(s2);
		int i = System.identityHashCode(s1);
		System.out.println(i);
		int j = System.identityHashCode(s2);
		System.out.println(j);
		System.out.println("Non-Literal String");
		String a1 = new String("kavi");
		String a2 = new String("vino");
		System.out.println(a1);
		System.out.println(a2);
		int x = System.identityHashCode(a1);
		System.out.println(x);
		int y = System.identityHashCode(a2);
		System.out.println(y);
		
		System.out.println("Immutable String");
		String d1="kavi";
		String d2="vino";
		System.out.println(d1);
		System.out.println(d2);
		int k = System.identityHashCode(d1);
		System.out.println(k);
		int l = System.identityHashCode(d2);
		System.out.println(l);
		String d3 = d1.concat(d2);
		System.out.println(d3);
		
		
		
	}

}
