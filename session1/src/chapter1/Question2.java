package chapter1;

class C1 {

	static String name = "Paras";
	int id;
	static double sal = 100;
	String add;

	static public void meth1() {
		System.out.println("static method called");
	}

	public String meth2() {
		return ("non static method called");
	}
}

public class Question2 {
	public static void main(String[] args) {
		C1 ob = new C1();
		ob.id = 10;
		ob.add = "poo";

		System.out.println(ob.add + " " + ob.id + " " + ob.meth2());
		System.out.println(C1.name + "" + C1.sal);
		C1.meth1();

	}

}
