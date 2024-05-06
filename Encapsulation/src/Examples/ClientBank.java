package Examples;

public class ClientBank {

	public static void main(String[] args) {
		Bank  bb = new Bank();
		
		bb.setBankHolderName("kiran");
		System.out.println("Name: "+bb.getBankHolderName());
		
		bb.setAccountNumber("1111");
		System.out.println("Account Number: "+bb.getAccountNumber());
		
		bb.deposite(5000);
		System.out.println("Balance: "+bb.getBalance("3333"));
	}

}
