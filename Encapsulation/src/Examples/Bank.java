package Examples;

public class Bank {
	private String bankHolderName;
	private String accountNumber;
	private long balance;
	
	public String getBankHolderName() {
		return bankHolderName;
	}
	public void setBankHolderName(String name) {
		bankHolderName=name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String AccountNumber) {
		this.accountNumber=AccountNumber;
	}
	
	public long getBalance(String upi) {
		long balance =0;
		if("3333" == upi) {
			return this.balance;
		}
		else
		{
			return balance;
		}
	}
	public void deposite(long balance) {
		 if (balance > 0) {
			 this.balance=balance; 
		 }
		
		
	}
	
}
