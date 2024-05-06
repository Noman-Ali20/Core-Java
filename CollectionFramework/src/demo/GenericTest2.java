package demo;

public class GenericTest2<E> {

	E x;

	public GenericTest2(E x) {
		this.x = x;
	}
	E getRes() {
		return x;
	}
	void setRes(E x) {
		this.x = x;
	}

	public static void main(String[] args) {
		GenericTest2<Integer> gt = new GenericTest2<>(10);
		System.out.println(gt.getRes());
		
		gt.setRes(1000);
		Integer i = gt.getRes();
		System.out.println(i);
	}

}
