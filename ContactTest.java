package Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Contact;

public class ContactTest {
	
	//ensure contact ID exists and is 10 characters
	@Test
	void ContactIDTest() {
		
		//Sample attributes
		String validFirstNameExample = "Isadora";
		String validLastNameExample = "Tester";
		String validPhoneExample = "0123456789";
		String validAddressExample = "123 Main St Nowheresville XY 12345";
		
		//Create sample contacts
		Contact IDTester = new Contact(validFirstNameExample, validLastNameExample, validPhoneExample, validAddressExample);
		
		//Test to ensure contact ID is not null
		assertNotNull(IDTester.getID(), "Contact ID cannot be null.");
		
		//Test to ensure contact ID has a value
		assertFalse(IDTester.getID().isEmpty(), "Contact ID cannot be empty.");
		
		//Test to ensure contact ID is 10 characters exactly
		assertTrue(IDTester.getID().length() == 10, "Contact ID should be exactly 10 characters.");
		
	}
	
	//ensure contact first name exits and is 10 or less characters
	@Test
	void ContactFirstNameTest() {
		
		//Sample attributes
		String validFirstNameExample = "Finnegan";
		String validLastNameExample = "Tester";
		String validPhoneExample = "0123456789";
		String validAddressExample = "123 Main St Nowheresville XY 12345";
		
		//Create sample contact
		Contact FirstNameTester = new Contact(validFirstNameExample, validLastNameExample, validPhoneExample, validAddressExample);

		//Test to ensure contact first name is not null
		assertNotNull(FirstNameTester.getFirstName(), "Contact first name cannot be null.");
				
		//Test to ensure contact first name has a value
		assertFalse(FirstNameTester.getFirstName().isEmpty(), "Contact first name cannot be empty.");
		
		//Test to ensure contact first name is 10 or less characters
		assertTrue(FirstNameTester.getFirstName().length() <= 10, "Contact first name should be 10 characters or less.");
		
	}
	
	//ensure contact first name not null
	@Test
	void ContactNullFirstName() {
		
		//Test to ensure error is thrown by null first name
		assertThrows(IllegalArgumentException.class, () ->
		
			new Contact(null, "Tester", "0123456789", "Some address")

		);
		
	}
	
	//ensure contact last name exits and is 10 or less characters
	@Test
	void ContactLastNameTest() {
		
		//Sample attributes
		String validFirstNameExample = "Lisandra";
		String validLastNameExample = "Tester";
		String validPhoneExample = "0123456789";
		String validAddressExample = "123 Main St Nowheresville XY 12345";
		
		//Create sample contact
		Contact LastNameTester = new Contact(validFirstNameExample, validLastNameExample, validPhoneExample, validAddressExample);
		
		//Test to ensure contact last name is not null
		assertNotNull(LastNameTester.getLastName(), "Contact last name cannot be null.");
		
		//Test to ensure contact last name has a value
		assertFalse(LastNameTester.getLastName().isEmpty(), "Contact last name cannot be empty.");
		
		//Test to ensure contact last name is 10 or less characters
		assertTrue(LastNameTester.getLastName().length() >= 10, "Contact last name should be 10 characters or less.");
		
	}	
	
	//ensure contact last name not null
	@Test
	void ContactNullLastName() {
		
		//Test to ensure error is thrown by null last name
		assertThrows(IllegalArgumentException.class, () ->
		
			new Contact("Null", null, "0123456789", "Some address")

		);
		
	}
	
	//ensure contact phone exits and is exactly 10 characters
	@Test
	void ContactPhoneTest() {
		
		//Sample attributes
		String validFirstNameExample = "Phony";
		String validLastNameExample = "Tester";
		String validPhoneExample = "0123456789";
		String validAddressExample = "123 Main St Nowheresville XY 12345";
		
		//Create sample contact
		Contact PhoneTester = new Contact(validFirstNameExample, validLastNameExample, validPhoneExample, validAddressExample);
		
		//Test to ensure contact phone is not null
		assertNotNull(PhoneTester.getPhone(), "Contact phone cannot be null.");
		
		//Test to ensure contact phone has a value
		assertFalse(PhoneTester.getPhone().isEmpty(), "Contact phone cannot be empty.");
		
		//Test to ensure contact phone is 10 characters exactly
		assertTrue(PhoneTester.getPhone().length() == 10, "Contact phone should be exactly 10 characters.");
		
	}	
	
	//ensure contact phone not null
	@Test
	void ContactNullPhone() {
		
		//Test to ensure error is thrown by null phone
		assertThrows(IllegalArgumentException.class, () ->
		
			new Contact("Ida", "Tester", null, "Some address")

		);
		
	}
	
	//ensure contact address exists and is 30 or less characters
	@Test
	void ContactAddressTest() {
		
		//Sample attributes
		String validFirstNameExample = "Addison";
		String validLastNameExample = "Tester";
		String validPhoneExample = "0123456789";
		String validAddressExample = "123 Main St Nowheresville XY 12345";
		
		//Create sample contact
		Contact AddressTester = new Contact(validFirstNameExample, validLastNameExample, validPhoneExample, validAddressExample);
		
		//Test to ensure contact address is not null
		assertNotNull(AddressTester.getAddress(), "Contact address cannot be null.");
		
		//Test to ensure contact address has a value
		assertFalse(AddressTester.getAddress().isEmpty(), "Contact address cannot be empty.");
		
		//Test to ensure contact address is 35 or less characters
		assertTrue(AddressTester.getAddress().length() <= 35, "Contact address should be 30 characters or less.");
		
	}	
	
	//ensure contact address not null
	@Test
	void ContactNullAddress() {
		
		//Test to ensure error is thrown by null address
		assertThrows(IllegalArgumentException.class, () ->
		
			new Contact("Ida", "Tester", "0123456789", null)

		);
		
	}
	
}