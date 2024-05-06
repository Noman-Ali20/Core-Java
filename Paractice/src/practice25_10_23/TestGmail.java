package practice25_10_23;

public class TestGmail {

	public static void main(String[] args) {
		Gmail myGmail = new Gmail(1);
		Email email1 = new Email("user1@gmail.com", "tka123@gmail.com", "Applying for Java Position",
				"I am very Intrested to work with you.");
		
		myGmail.sendEmail(email1);
		

		myGmail.checkEmails();

	}

}
