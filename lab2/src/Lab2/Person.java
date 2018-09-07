package Lab2;

public class Person {
	public Person(String firstname, String lastname, char gender,double phonenumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phonenumber=phonenumber;
		
		
	}
	private double phonenumber;
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	private String firstname,lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private char gender;
	public Person() {
		super();
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	public void Persondetails()
	{
		System.out.println("PersonDetails-----------");
		System.out.println("Firstname "+getFirstname());
		System.out.println("Lastname "+getLastname());
		System.out.println("Gender "+ getGender());
		System.out.println("Phonenumber "+ getPhonenumber());
		
	}

}
