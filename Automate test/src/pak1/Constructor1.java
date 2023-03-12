package pak1;

public class Constructor1 {
	public constructor1() {
		System.out.println("default constructor");
	}
	public constructor1(int a) {
		System.out.println("one pera constructor");
	}
	public constructor1(int a, int b) {
		System.out.println("two pera constructor");
	}
	public constructor1(int a, int b, int c) {
		System.out.println("three pera constructor");
	}
	public constructor1(int a, int b, int c, int d) {
		System.out.println("four pera constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor1 obj=new constructor1(10,20);
	}

}
