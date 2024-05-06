package test;

public class pattern16 {

	public static void main(String[] args) {
		int i,n,j;
		n=7;
		 for (i = n; i >= 1; i--) {
	            for (j = 1; j < i; j++) {
	                System.out.print(" ");
	            }

	            for (j = 0; j <= n - i; j++) {
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	}

}
//0 
//0 1 
//0 1 2 
//0 1 2 3 
//0 1 2 3 4 
//0 1 2 3 4 5 
//0 1 2 3 4 5 6 