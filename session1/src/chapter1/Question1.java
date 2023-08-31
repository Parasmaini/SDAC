package chapter1;

class Emp {

	String name = "Paras";
	int id = 1;
	double sal = 100000;
	String address = "Poonam Enclave";

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	public void meth1() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}
}

public class Question1 {
	public static void main(String[] args) {
		Emp ob = new Emp();
		ob.meth1();
		System.out.println(ob);
	}
}
