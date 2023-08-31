package chapter1;

class C2 {

	public String name = "hello";
	private int id = 10;
	int number = 50;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Question3 {
	protected double sal = 100;

	public static void main(String[] args) {
		C2 ob1 = new C2();
		System.out.println(ob1.name + " " + ob1.number + " " + ob1.getId());

	}
}
