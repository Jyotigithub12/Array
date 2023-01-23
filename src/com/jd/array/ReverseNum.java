package com.jd.array;

public class ReverseNum {

	public static void main(String[] args) {
		int n=345;
		int rev=0;
		while(n>0) {
			rev= rev*10+n%10;
			n=n/10;
		}
		System.out.println("reverse num::" +rev);

	}

}
