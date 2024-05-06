package Demo;

public class LadderIf {
	public static void main(String args[]) {
		int month = 1;
		if (month==3 | month==4 |month==5 |month==6 ) // if(month >= 3 & month<=6)
			System.out.println("Summer Season");
		else if (month==7 | month==8 |month==9 |month==10 )//if(month >=7 & month <=10)
			System.out.println("Rainy Season");
		else if (month==11 | month==12 |month==1 |month==2)
			System.out.println("Winter Season");
		else
			System.out.println("Invalid Month");
	}
}


