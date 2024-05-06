package practice;

public class Triangle {

	public static void main(String[] args) {
		// Triangle rule -> if i<n the j<i;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {      //inner loop -> j<=i is for triangle
				System.out.print( "* ");
			}
			System.out.println();
		}
	}

}
