package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Contact;
import model.TestContact;
import util.MyConsole;

public class ContactManagerApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Contact Manager - With Lambdas!\n");
		
		List<Contact> contacts = new ArrayList<>(); 
		contacts.add(new Contact("Mike Murach", null, "800-221-5528")); 
		contacts.add(new Contact("Anne Boehm", null, null)); 
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		// show all contacts
		displayContacts(contacts, "All Contacts");
		
		// show contacts - missing phone #s
		List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone()==null);
//		for (Contact c: contacts) {
//			if (c.getPhone()==null) {
//				contactsNoPhone.add(c);
//			}
//		}
		displayContacts(contactsNoPhone, "Contacts - no phone");
		// show contacts - missing emails
		List<Contact> contactsNoEmail = filterContacts(contacts, c -> c.getEmail()==null);
//		for (Contact c: contacts) {
//			if (c.getEmail()==null) {
//				contactsNoEmail.add(c);
//			}
//		}
		displayContacts(contactsNoEmail, "Contacts - no email");
		
		// show contacts - missing phone AND email
		List<Contact> contactsNoPhoneNoEmail = filterContacts(contacts, c -> c.getEmail()==null && c.getPhone()==null);
		displayContacts(contactsNoPhoneNoEmail, "Contacts - no phone, no email");

		// show contacts - last name "Murach"
		List<Contact> contactsMurach = filterContacts(contacts, (Contact c) -> {
			String [] names = c.getName().split(" ");
			String lastName = names[1];
			return lastName.equals("Murach");
			});
		displayContacts(contactsMurach, "Contacts - last name Murach");

		// print the names of the contacts
		MyConsole.printHeader("Contact names");
		processContacts(contacts, c -> MyConsole.printL(c.getName()));
		
		// change the names in the contact list to uppercase
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		MyConsole.printL("Contact names, again!");
		processContacts(contacts, c -> MyConsole.printL(c.getName()));

		MyConsole.printHeader("Contact strings (name + phone) w/ default values if phone is null");
		List<String> contactPhoneNumbers = transformContacts (contacts,
				c -> {
					String phone = (c.getPhone()==null) ? "n/a" : c.getPhone();
					return c.getName() + ": " + phone;
				});
		// for loop to print strings
		for (String s: contactPhoneNumbers) {
			MyConsole.printL(s);
		}
		
		// p. 551 use streams to do the same thing
		MyConsole.printHeader("Use stream to print phone info:");
		contactPhoneNumbers.stream().forEach(s -> MyConsole.printL(s));
		
		// BONUS: streams on arrays? No - convert Array to a List first
		MyConsole.printHeader("Class names Array converted to a list for streams");
		String[] names = {"Jim", "Celina", "Heath", "Andy"};
		List<String> namesList = Arrays.asList(names);
		namesList.forEach(n -> MyConsole.printL(n));
		
		// make names upper case
//		namesList.stream().forEach(s -> s = s.toUpperCase());
//		namesList.forEach(n -> MyConsole.printL(n));
		
		// use a sream to filter a list and process each element
		contacts.stream()
				.filter(c -> c.getPhone()==null)
				.forEach(c -> MyConsole.printL(c.getName()));
		
		// use a stream to filter a list and collect the items in a new list
		// p. 551 use a stream to filter a list and process each element
		List<Contact> contactsNoPhone2 = contacts.stream()
				.filter(c -> c.getPhone() == null)
				.collect(Collectors.toList());
		
		contactsNoPhone2.stream().forEach(c -> MyConsole.printL(c.toString()));
		
		// p. 553 - Map
		// use a stream to transform a list of contact objects to a list of strings
		List<String> contactNames = contacts.stream()
				.map(c -> c.getName())
				.collect(Collectors.toList());
		
		MyConsole.printL("map to string");
		contactNames.stream().forEach(str -> MyConsole.printL(str));
		
		// same example w/ double colon operator
		List<String> contactNames2 = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
		
		MyConsole.printL("map to string 2");
		contactNames2.stream().forEach(MyConsole::printL);
		
		// p. 555 map - reduce contacts to a single string in csv format
		String csv = contacts.stream().map(c -> c.getName()).reduce("", (a, b) -> a + b + ", ");
		MyConsole.printHeader("csv - map reduce");
		csv = csv.substring(0,csv.length()-2);
		MyConsole.printL("csv = "+csv);
		
		List<Double> prices = new ArrayList<>(Arrays.asList(11059.32, 23456.0, 31789.8, 1111.11, 40123.5));
		// largest price
		double maxPrice = prices.stream().reduce(0.0, (a,b) -> Math.max(a, b));
		MyConsole.printL("maxPrice = " +maxPrice);
		
		// method reference
		double minPrice = prices.stream().reduce(Double.MAX_VALUE, Math::min);
		MyConsole.printL("maxPrice = " +minPrice);
		
		MyConsole.printL("\nNo mas lambdas");
	}
	
	// p. 545 - Consumer
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
	
	// p.547 - Function
	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c: contacts) {
			strings.add(function.apply(c));
		}
		
		return strings;
	}
	
	private static void displayContacts(List<Contact> contacts, String header) {
		MyConsole.printHeader(header, "-");
		for (Contact c: contacts) {
			MyConsole.printL(c.toString());
		}
	}
	
	// p. 543 - Predicate
	//private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
