package test;

public class pattern12 {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
		    for (int j = 1; j <= 10; j++) {
		        	if(j==10 || i==1 || i==3 || j==8 ||j==1 || j==3 || i==10 || i==8)
		            System.out.print("* ");
		            else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}


	}

}
