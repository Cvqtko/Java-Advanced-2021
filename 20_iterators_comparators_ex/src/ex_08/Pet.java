package ex_08;

public class Pet {
	private String name;
	private int age;
	private String kind;

	public Pet(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.kind;
	}
}