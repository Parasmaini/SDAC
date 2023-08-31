package chapter3;

class C10 {

	static String name = "hello";
	int id;
	static double sal = 1000;
	String add;

	static public void meth1() {
		System.out.println("static method called");
	}

	public String meth2() {
		return ("non static method called");
	}
}

public class Question1 {
	public static void main(String[] args) {
		C10 ob = new C10();
		ob.id = 100;
		ob.add = "pojo";

		System.out.println(ob.add + " " + ob.id + " " + ob.meth2());
		System.out.println(C10.name + "" + C10.sal);
		C10.meth1();

	}

}
