package javatest;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int a= sc.nextInt();
		int b=a;
		int rev=0;
		while(a!=0)
		{
			rev=rev*10 + a%10;
			a=a/10;
			
		}
		if(b==rev) {
		System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not a palindrome");
		}
		
		
		
	}

}
