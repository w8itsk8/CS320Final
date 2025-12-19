package Test;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.Contact;
import Main.ContactService;

public class ContactServiceTest {
	
	private ContactService contactService;
	
	@BeforeEach
	void CreateContactService() {
		contactService = new ContactService();
		Contact sampleContact = new Contact("Original", "Contact", "0123456789", "123 Main St Nowheresville XY 12345");
		contactService.NewContact(sampleContact);
	}
	
	//Ensure function to update first name works
	@Test
	void UpdateFirstNameTest() {
		
		String preUpdateFirstNameExample = "Farrah";
		String postUpdateFirstNameExample = "Sarah";
		String lastNameExample = "Tester";
		String phoneExample = "0123456789";
		String addressExample = "123 Main St Nowheresville XY 12345";
		
		Contact updateFirstNameContactExample = new Contact(preUpdateFirstNameExample, lastNameExample, phoneExample, addressExample);
		contactService.UpdateFirstName(updateFirstNameContactExample, postUpdateFirstNameExample);
		
		Assert.assertEquals(updateFirstNameContactExample.getFirstName(), postUpdateFirstNameExample);
		
	}
	
	//Ensure function to update last name works
	@Test
	void UpdateLastNameTest() {
			
		String firstNameExample = "Tester";
		String preUpdateLastNameExample = "Smurfy";
		String postUpdateLastNameExample = "Murphy";
		String phoneExample = "0123456789";
		String addressExample = "123 Main St Nowheresville XY 12345";
		
		Contact updateLastNameContactExample = new Contact(firstNameExample, preUpdateLastNameExample, phoneExample, addressExample);
		contactService.UpdateLastName(updateLastNameContactExample, postUpdateLastNameExample);
		
		Assert.assertEquals(updateLastNameContactExample.getLastName(), postUpdateLastNameExample);
		
	}
	
	//Ensure function to update phone works
	@Test
	void UpdatePhoneTest() {
			
		String firstNameExample = "Tester";
		String lastNameExample = "Smurfy";
		String preUpdatePhoneExample = "0123456798";
		String postUpdatePhoneExample = "0123456789";
		String addressExample = "123 Main St Nowheresville XY 12345";
		
		Contact updatePhoneContactExample = new Contact(firstNameExample, lastNameExample, preUpdatePhoneExample, addressExample);
		contactService.UpdatePhone(updatePhoneContactExample, postUpdatePhoneExample);
		
		Assert.assertEquals(updatePhoneContactExample.getPhone(), postUpdatePhoneExample);
		
	}
			
	//Ensure function to update address works
	@Test
	void UpdateAddressTest() {
		
		String firstNameExample = "Tester";
		String lastNameExample = "Smurfy";
		String phoneExample = "0123456798";
		String preUpdateAddressExample = "132 Main St Nowheresville XY 12345";
		String postUpdateAddressExample = "123 Main St Nowheresville XY 12345";
		
		Contact updateAddressContactExample = new Contact(firstNameExample, lastNameExample, phoneExample, preUpdateAddressExample);
		contactService.UpdateAddress(updateAddressContactExample, postUpdateAddressExample);
		
		Assert.assertEquals(updateAddressContactExample.getAddress(), postUpdateAddressExample);
		
	}

	//Ensure contact successfully added
	@Test
	void NewContactTest() {
		
		String firstNameExample = "Polly";
		String lastNameExample = "Pocket";
		String phoneExample = "0123456798";
		String addressExample = "123 Main St Nowheresville XY 12345";
		
		Contact newContact = new Contact(firstNameExample, lastNameExample, phoneExample, addressExample);
		contactService.NewContact(newContact);
		Assertions.assertFalse(contactService.GetContact(newContact.getID()).getFirstName().equals("Polly"));
		
	}
	
	//Ensure contact is successfully deleted
	@Test
	void DeleteContactTest() {
		
		String firstNameExample = "Polly";
		String lastNameExample = "Pocket";
		String phoneExample = "0123456798";
		String addressExample = "123 Main St Nowheresville XY 12345";
		
		Contact newContact = new Contact(firstNameExample, lastNameExample, phoneExample, addressExample);
		contactService.NewContact(newContact);
		Assertions.assertNull(contactService.GetContact(newContact.getID()), "This method should return null if the item is successfully deleted.");
		
	}
			
}