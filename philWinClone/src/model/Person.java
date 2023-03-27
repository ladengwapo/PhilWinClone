package model;

public abstract class Person {
	
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setMiddlentName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastname() {
		return lastName;
	}

}
