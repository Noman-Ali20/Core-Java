package test;

public class pattern7 {

	public static void main(String[] args) {
		for (int i=1;i<=11;i++){
            for (int j =1;j<=14;j++){
                if(i==1 || j==1  || i==6 || j==7 || j==14 || i==11 )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
		}

	}

}
