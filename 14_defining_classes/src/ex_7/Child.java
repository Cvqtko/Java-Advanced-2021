package ex_7;

public class Child {
	// <childName> <childBirthday>"
	private String childName;
	private String childBirthday;

	public Child(String childName, String childBirthday) {
		this.childName = childName;
		this.childBirthday = childBirthday;
	}

	@Override
	public String toString() {
		return childName + " " + childBirthday;
	}

}
