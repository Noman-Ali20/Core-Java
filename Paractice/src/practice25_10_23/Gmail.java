package practice25_10_23;

public class Gmail {
	InBox inbox;

	public Gmail(int inboxSize) {

		inbox = new InBox(inboxSize);
	}

	public void sendEmail(Email email) {
		inbox.addEmail(email);
	}

	public void checkEmails() {

		inbox.displayEmails();
	}

}
