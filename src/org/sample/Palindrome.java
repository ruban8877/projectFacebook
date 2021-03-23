package org.sample;

public class Palindrome {
	public static void main(String[] args) {
		int num = 152;
		int res = 0;
		int rem = 0;
		int n= num;
		while (n>0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println(res);
		System.out.println(num);
		if (num==res) {
			System.out.println(" palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}  
	
	

}
