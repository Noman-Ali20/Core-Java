package practice25_10_23;

public class InBox {
	private Email[] emails;
    private int emailCount;
    private int maxSize;

    public InBox(int maxSize) {
        this.maxSize = maxSize;
        this.emails = new Email[maxSize];
        this.emailCount = 0;
    }

    public void addEmail(Email email) {
        if (emailCount < maxSize) {
            emails[emailCount] = email;
            emailCount++;
        } 
        else {
            System.out.println("Inbox is full. Cannot add more emails.");
        }
    }

    public void displayEmails() {
        for (int i = 0; i < emailCount; i++) {
            System.out.println(emails[i]);
        }
    }
	
}
