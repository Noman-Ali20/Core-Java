package test;

public class pattern15 {

	public static void main(String[] args) {
		int i,n,j;
		n=7;
		 for (i = n; i >= 1; i--) {
	            for (j = 1; j < i; j++) {
	                System.out.print(" ");
	            }

	            for (j = 0; j <= n - i; j++) {    
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}

}
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * * 
//* * * * * * * 
