package twoDArray;

public class additionOfTwoDArray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };
		
		int c[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {       //outer for loop
			for (int j = 0; j < b.length; j++) {   //inner for loop
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();    //new line
		}

	}

}
