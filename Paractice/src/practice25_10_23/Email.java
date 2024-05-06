package practice25_10_23;

import java.lang.reflect.Array;

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
	
    
    public String toString() {
        return "From: " + from + "\nTo: " + to + "\nSubject: " + subject + "\nBody: " + body + "\n";
    }
	
	
}
