package test;

public class pattern18 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			
			for(int j=1;j<=9;j++) {  
				if(i==1 || i==9 || j==1 || j==9 || j==6 || j==7 || j==8  || i==7 || i==8)//inner loop -> j<=i is for triangle
				System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
//* * * * * * * * * 
//*         * * * * 
//*         * * * * 
//*         * * * * 
//*         * * * * 
//*         * * * * 
//* * * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * * 