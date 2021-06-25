package ex_07;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public boolean equals(Object other) {


		if (this.hashCode() == other.hashCode()) {
			return true;
		}
		if (other.getClass().getSimpleName().equals(Person.class.getSimpleName())) {
			Person current = (Person) other;
			return this.name.equals(current.getName()) && this.age == current.getAge();
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + age;
		hash = 31 * hash + (name == null ? 0 : name.hashCode());
		return hash;

		
	}

	@Override
	public int compareTo(Person other) {
		return Comparator.comparing(Person::getName).thenComparing(Person::getAge).compare(this, other);
	}
}