package problems;

public class PalindromString {

	public static void main(String[] args) {
		String input="liril";
		 boolean p = true;
		int left=0;
		int right=input.length()-1;
		while(left<right) {
			if(input.charAt(left)!=input.charAt(right)) {
				p=false;
				break;
			}
			left++;
			right--;
		}
		if(p)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
			
		
	
		
	}

}
