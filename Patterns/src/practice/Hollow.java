package practice;

public class Hollow {

	public static void main(String[] args) {
		// Hollow Pattern -> apply the required conditions inside for loop
		
				for(int i=1;i<=5;i++)
				{
					
					for(int j=1;j<=5;j++) {  
						if(i==1 || i==5 || j==1 || j==5  ||i==3 || j==3)//inner loop -> j<=i is for triangle
						System.out.print("* ");
						else 
							System.out.print("  ");
					}
					System.out.println();
				}
			}

		

	}


