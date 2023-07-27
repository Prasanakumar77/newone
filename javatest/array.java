package javatest;

public class array {

	public static void main(String[] args) {
	     
		int[][] twodimension= {{1,2,3},{4,5,6},{7,8,9}};
		
		int rows=twodimension.length;
		int coloumns=twodimension[0].length;
		for(int i=0;i<rows;i++) {
		for(int j=0;j<coloumns;j++) {
			int value=twodimension[i][j];
			System.out.print(value + " ");

		}
		System.out.println();
		}
	}

}
