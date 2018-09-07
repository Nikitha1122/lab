package lab61.pkg;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private String lname;
	private char gender;


public void Details()
{
	System.out.println("Details");
	System.out.println("first name :"+getFname());
	System.out.println("last name        :"+ getLname());
	System.out.println("Gender    :"+getGender());
}
}

