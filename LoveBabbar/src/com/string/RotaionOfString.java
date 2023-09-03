package com.string;

public class RotaionOfString {
	
	public static boolean rotaionOfStringMatch(String s1, String s2) {
		
		String temp = s1+s1;
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			if(temp.contains(s2)) {
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		System.out.println(rotaionOfStringMatch("ABACD","CDABA"));		

	}

}
