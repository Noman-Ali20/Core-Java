package test2;

public class CheckElementPresent {

	public static void main(String[] args) {
		String str[] = {"banana","pinapple","apple","mango"};
		String target="man";
		int c=0;
		boolean found= true;
		for(int i=0;i<=str.length-1;i++) {
			if(target==str[i]) {
				c++;
				
			}
			else {
				found=false;
			}
		}
		if(c>0)
		System.out.println("target "+target+": found");
		else
			System.out.println("not found");

	}

}
