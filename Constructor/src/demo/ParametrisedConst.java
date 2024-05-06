package demo;

public class ParametrisedConst {
	
	ParametrisedConst(){                             //default constructor
		System.out.println("Default Constructor called");
	}
	
	ParametrisedConst(String name){                  //Parametrised constructor
		System.out.println("Parametrised Constructor called ");
	}
	
	void setData() {
		System.out.println("Method called");
	}
	public static void main(String args[]) {
		
		ParametrisedConst pc1 = new ParametrisedConst("sahil");
		pc1.setData();
	}
}
