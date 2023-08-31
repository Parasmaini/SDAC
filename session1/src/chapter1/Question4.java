package chapter1;

class C4 {

	public int m1(int a, int b) {
		return (a + b);
	}

	public int m1(int a, int b, int c) {
		return (a + b + c);
	}

	public double m1(double a, double b, double c, double d) {
		return (a + b + c + d);
	}

}

class C5 extends C4 {

	@Override
	public int m1(int a, int b) {
		// TODO Auto-generated method stub
		return (a + b);
	}

	@Override
	public int m1(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (a + b + c);
	}

	@Override
	public double m1(double a, double b, double c, double d) {
		// TODO Auto-generated method stub
		return (a + b + c + d);
	}

}

public class Question4 {
	public static void main(String[] args) {
		C4 ob1 = new C4();
		System.out.println(ob1.m1(10, 10));
		System.out.println(ob1.m1(10, 10, 10));
		System.out.println(ob1.m1(50, 50, 50, 50));

		C5 ob2 = new C5();
		System.out.println(ob2.m1(2, 2));
		System.out.println(ob2.m1(2, 2, 2));
		System.out.println(ob2.m1(10, 10, 10, 10));
	}
}
