package javatest;

import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your string");
		String a=sc.next();
		String temp1="",temp2="",temp3="";
		for(int i=0; i<a.length(); i++ ) {
		if(a.charAt(i)>=65&&a.charAt(i)<=90 || a.charAt(i)>=97&&a.charAt(i)<=122)
		{
			temp1=temp1+""+a.charAt(i);
		}
		else if(a.charAt(i)>=48 && a.charAt(i)<=57) {
			temp2=temp2+""+a.charAt(i); 
		}
		else {
			temp3=temp3+""+a.charAt(i);
		}
		}
		System.out.println(temp1+temp2+temp3);
			
		
		
		
		

	}

}
