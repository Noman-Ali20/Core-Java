package test;

public class pattern5SpecialTri {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++){
            for (int j =1;j<=7;j++){
                if(i==1 || j==1  || i==5 || j==3  || j==5 || j==7 )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
		}
	}
}
