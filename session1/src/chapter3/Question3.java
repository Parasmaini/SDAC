package chapter3;



class C12 {

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

class C5 extends C12 {

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

public class Question3 {
	public static void main(String[] args) {
		C12 ob1 = new C12();
		System.out.println(ob1.m1(10, 10));
		System.out.println(ob1.m1(10, 10, 10));
		System.out.println(ob1.m1(50, 50, 50, 50));

		C5 ob2 = new C5();
		System.out.println(ob2.m1(2, 20));
		System.out.println(ob2.m1(20, 20, 2));
		System.out.println(ob2.m1(100, 100, 100, 100));
	}
}
