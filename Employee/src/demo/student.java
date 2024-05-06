package demo;

class employee {
	String name = "ali";
	int rollnum = 11;
	byte age = 21;
	void hasPart() {
		
		System.out.print(age);
	}
	void does() {
		System.out.println("He is studying");
	}
}

class student{
	public static void main(String[] args) {
		employee st = new employee();
		st.hasPart();
	}
	
}
