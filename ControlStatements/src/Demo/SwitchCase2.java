package Demo;

public class SwitchCase2 {

	public static void main(String[] args) {
		int m = 5;
		switch(m) {
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Its Summer Season");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Its Rainy Season");
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("Its Winter Season");
			break;
		default:
			System.out.println("Invalid Month number");
		}

	}

}
