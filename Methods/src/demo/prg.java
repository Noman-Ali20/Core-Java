package demo;

public class prg {
	int x;
	
	public void m1(prg b) {
		b.x=77;
		System.out.println(b.x);
	}
	public static void main(String args[]) {
		prg t = new prg();
		t.x = 55;
		System.out.println(t.x);
		t.m1(t);
		System.out.println(t.x);
	}
}
