package org.string;

public class SampleString {
	public static void main(String[] arg) {
		String s="JavaSelenium";
		int in = s.indexOf("i");
		System.out.println(in);
		int lin = s.lastIndexOf("a");
		System.out.println(lin);
		//contains
		boolean con = s.contains("len");
		System.out.println(con);
		//Trim(Remove the Space
		String s1=" Selenium Testing ";
		String trim = s1.trim();
		System.out.println(trim);
		//isEmpty
		boolean em = s.isEmpty();
		System.out.println(em);
		//substring
		String s2="kalaivani vani kalai";
		String sub = s2.substring(2);
		System.out.println(sub);
		String sub1 = s2.substring(2, 13);
		System.out.println(sub1);
		//split
		String s3="kavitha kalai kv";
		String[] sp = s3.split(" ");
		for (String x : sp) {
			System.out.println(x);
			
			
		}
		
	}

}
