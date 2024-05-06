package Demo;

public class NestedIf {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (a==10)    //10==10
			if(b==10)  // 20==10 false
				System.out.println("20 is here");
			else
				System.out.println("20 Not present");
		else
			System.out.println("wrong way");

	}

}
