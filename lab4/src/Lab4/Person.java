package Lab4;

public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public Person(String name, double age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	private double age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
