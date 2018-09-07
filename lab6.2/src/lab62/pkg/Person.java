package lab62.pkg;

public class Person {
	
	public Person(String n1, int age2) {
		// TODO Auto-generated constructor stub
		this.name = n1;
		this.age = age2;
	}
	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}

}
