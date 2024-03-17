package demo;

public class Client {

	public static void main(String[] args) {
		Account jay = new Account("JAY", "1111", 500, "9595 24 9241", "ADHAR123", "PAN123");
		jay.deposite(200);
		jay.withdraw(100);
		jay.printAccountHolderInfo();
	    
	    
		Account nayan = new Account("NAYAN", "2222", 5100, "8265 45 8455", "ADHAR877", "PAN124");
		nayan.withdraw(100);
		nayan.printAccountHolderInfo();
		
		Account pavan = new Account("PAVAN", "3333", 1000, "9569 84 5487", "ADHAR654", "PAN125");
		pavan.printAccountHolderInfo();
		
		Account kiran = new Account("KIRAN", "4444", 600, "9685 47 1234", "ADHAR894", "PAN126");
	    kiran.printAccountHolderInfo();
	}

}
