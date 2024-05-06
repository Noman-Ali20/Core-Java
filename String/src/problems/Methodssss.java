package problems;

public class Methodssss {

	public static void main(String[] args) {
		String s = "I Love india";
		String s1= "india";
		System.out.println("charAt method: "+s.charAt(8));
		
		System.out.println("contains method: "+s.contains("edc"));  //it will check sequence is present or not
		System.out.println("Hashcode method: "+s.hashCode());       //it will return the hashcode 
		System.out.println("tocharArray method: "+s.toCharArray()); //convert into char array
		System.out.println("Concat method: "+s.concat(s1));         //it will add the two string
		System.out.println("Strip Method: "+s.strip());
	}

}
