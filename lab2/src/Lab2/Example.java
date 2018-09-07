package Lab2;

public class Example {
	public Example(String fname, String lname, Gender gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	String fname,lname;
	private Gender gender;
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
	public void printdetails()
	{
		System.out.println("first name: "+fname);
		System.out.println("last name: "+lname);
		System.out.println("gender: " +gender);
	}

	
}
