package demo;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private String accountHolderContact;
	private String aadharNumber;
	private String panNumber;
	
	public static String bankName = "TKA Bank";
	public static String ifscCode = "TKA3333";
	public static String bankAddress ="Ambedkar Chowk, Pune";
	public static String contactNumber = "0691423";
	
	public Account(String accountHolderName, String accountNumber, double balance, String accountHolderContact, String aadharNumber, String panNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		if(balance >= 500) {
			this.balance=balance;
		}
		else {
			this.balance=500;
		}
		this.accountHolderContact = accountHolderContact;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderContact() {
		return accountHolderContact;
	}

	public void setAccountHolderContact(String accountHolderContact) {
		this.accountHolderContact = accountHolderContact;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	public double checkBalance() {
		return this.balance;
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			this.balance = this.balance + amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount < this.balance && amount > 0) {
			this.balance = this.balance - amount;
		}else {
			System.out.println("Insufficiant Balance !!!");
		}
	}
	public void printAccountHolderInfo() {
		System.out.println("BANK NAME: "+this.bankName);
		System.out.println("Account HolderName: "+this.accountHolderName);
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Account Balance: "+this.balance);
		System.out.println("Account Holder Contact: "+this.accountHolderContact);
		System.out.println("AADHAR NUMBER: "+this.aadharNumber);
		System.out.println("PAN NUMBER: "+this.panNumber);
		System.out.println("**************************************************");
		
	}
}
