package oop3;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	
    public Customer() { // private lara eri�mek i�in kulland�k.
		
}
	
	public Customer(int id, String firstName, String lastName) { //source ile yapt�k
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
//bu k�s�mda source ile geldi
	public int getId() { 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



}
