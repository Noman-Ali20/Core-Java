package practice;

public class Email {
	String from;
	String to;
	String subject;
	String body;

	
	public Email(String from, String to, String subject, String body) {
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
	public void show() {
		System.out.println("From: "+from);
		System.out.println("To: "+to);
		System.out.println("subject: "+subject);
		System.out.println("body: "+body);
	}
}
