package com.string;

public class CountTosay {
	
	public  static String countToSay(int n) {
		
		if(n==1) return "1";
		if(n==2) return "11";
		String s="21";
		for(int i=3;i<n;i++) {
			s=s+"$";
			int l= s.length();
			int c=1;
			String t="";
			char[] arr= s.toCharArray();
			for(int j=1;j<l;j++) {
				if(arr[j]==arr[j-1]) {
					c++;
				}
				else {
					t+=c+0;
					t+=arr[j-1];
					c=1;
				}
			}
			s=t;
		}
		return s;
		
		
		
	}

	public static void main(String[] args) {
		int n=3;
		
		System.out.println(countToSay(n));
		
	}

}
