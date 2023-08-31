package chapter3;

class C14 {
	String var = "Global Variable Called";
	static String var0 = "Static Variable Called";

	String meth() {
		return "Local Variable Called";
	}
}

public class Question5 {
	public static void main(String[] args) {
		C14 ob1 = new C14();
		System.out.println(ob1.var + "\n" + C14.var0);
		System.out.println(ob1.meth());
	}
}
