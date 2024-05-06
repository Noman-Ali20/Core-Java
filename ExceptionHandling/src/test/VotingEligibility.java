package test;

public class VotingEligibility {

	int x;

	public static void getAge(int x) {
		System.out.println("Your Election card is Ready...");
		System.out.println("Aapka Vote Apka Adhikar..");
	}

	public void checkAge(int age) throws Above50,Under18{

		if (age < 18) {
			throw new Under18("You are under 18, Sorry");
		} else if (age > 50) {
			throw new Above50("Renew your Election Card!!");
		}

		else {
			System.out.println("You can make your Election Card..");
			VotingEligibility.getAge(age);
		}

	}

}
