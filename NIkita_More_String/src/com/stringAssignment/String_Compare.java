//Compare string using == when “” is present see same reference is there
package com.stringAssignment;

public class String_Compare {
	public static void main(String[] args) {
		String s1= "i love my india";
		String s2 = "i love my india";
		String s3 = "I Love My India";
		System.out.println("s1 = s2 :"+(s1==s2));
		System.out.println("s1 = s2 :"+(s1==s3));

	}
}
