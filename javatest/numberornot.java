package javatest;

public class numberornot {
	public static void main(String[] args) {
		
		String str="12345text";
		int length=str.length();
		System.out.println(onlydigits(str,length));
	}

	private static boolean onlydigits(String str, int n) {
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)<'0' || str.charAt(i)>'9') {
				return false;
			}
		}
	
		       return true;
	}

	
}
