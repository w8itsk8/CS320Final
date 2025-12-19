package Main;


import java.util.Vector;

public class ContactService {
	
	public Vector<Contact> contacts = new Vector<>();
	
	String firstName;
	String lastName;
	String phone;
	String address;
	
	public Contact NewContact(Contact newContact) {
		contacts.add(newContact);
		return newContact;
	}
	
	public Contact UpdateFirstName(Contact contact, String newFirstName) {
		contact.setFirstName(newFirstName);
		return contact;
	}
	
	public Contact UpdateLastName(Contact contact, String newLastName) {
		contact.setLastName(newLastName);
		return contact;
	}
	
	public Contact UpdatePhone(Contact contact, String newPhone) {
		contact.setPhone(newPhone);
		return contact;
	}
	
	public Contact UpdateAddress(Contact contact, String newAddress) {
		contact.setAddress(newAddress);
		return contact;
	}
	
	public Vector<Contact> DeleteContact(Contact deletedContact) {
		contacts.remove(deletedContact);
		return contacts;
	}
	
	public Contact GetContact(String contactID) {
		for (Contact contact : contacts) {
			if(contact.getID() == contactID) {
				return contact;
			}
		}
		return null;
	}
	
}