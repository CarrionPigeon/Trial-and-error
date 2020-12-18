package com.modernjava;

public class StringReverser {
	
	public String reverse(String s) {
		int j = s.length();
		char[] result = new char[j];
		for (int i = 0; i < s.length(); i++) {
			result[--j] = s.charAt(i);
		}
		return new String(result);
	}

}
