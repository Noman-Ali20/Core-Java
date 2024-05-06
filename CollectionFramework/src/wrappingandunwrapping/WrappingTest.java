package wrappingandunwrapping;

public class WrappingTest {
	public static void main(String[] args) {
		int x = 10;        //primitive value
		Integer.valueOf(x);//here, Object of x is created using Integer Wrapping class.
		System.out.println(x);
		
		String s="20";     //String value stored
		Integer.parseInt(s); //it will convert string value into integer
		System.out.println(s);
		
		String y="30";
		double d=Double.parseDouble(y);
		System.out.println(d);
		
		int z=40;
		int i=Integer.valueOf(z);//here, i did unboxing/ un-wrapping
		System.out.println(i);
	}
}
