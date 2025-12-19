package Main;


import java.util.UUID;

public class Contact {
	
	String ID;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	public Contact() {
		
	}
	
	public Contact(String firstName, String lastName, String phone, String address) {
		
		//set unique ID
		String ID;
		UUID uuid = UUID.randomUUID();
		ID = uuid.toString();
		ID = ID.substring(0, 10);
		this.ID = ID;
		
		if (firstName != null && firstName.length() <= 10) {
			this.firstName = firstName;
		}
		
		if (lastName != null && lastName.length() <= 10) {
			this.lastName = lastName;
		}
		
		if (phone != null && phone.length() == 10) {
			this.phone = phone;
		}
		
		if (address != null && address.length() <= 30) {
			this.address = address;
		}
		
	}
	
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String contactFirstName) {
		this.firstName = contactFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String contactLastName) {
		this.lastName = contactLastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String contactPhone) {
		this.phone = contactPhone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String contactAddress) {
		this.address = contactAddress;
	}
	
}