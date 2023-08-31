package chapter3;

class C13 {

	private String name;
	private double salary;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Question4 {
	public static void main(String[] args) {

		C13 ob3 = new C13();
		ob3.setName("paras");
		ob3.setSalary(20000);
		ob3.setId(20);

		System.out.println(ob3.getName() + " " + ob3.getSalary() + " " + ob3.getId());
	}
}
