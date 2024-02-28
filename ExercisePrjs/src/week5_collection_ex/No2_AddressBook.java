//Display a menu with options to add a new contact, search for a contact, display all contacts, and exit.
//If the user chooses to add a new contact, prompt them to enter the name and phone number, then store this information in a HashMap where the name is the key and the phone number is the value.
//If the user chooses to search for a contact, prompt them to enter the name, then display the corresponding phone number if the contact exists.
//If the user chooses to display all contacts, iterate over the HashMap and print out each contact along with their phone number.
//Repeat the above steps until the user chooses to exit.

package week5_collection_ex;

import java.util.HashMap;
import java.util.Scanner;

public class No2_AddressBook {
	
	
	public static void main(String[] args) {
		AddressBookProcess abp = new AddressBookProcess();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add a new contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Display all contacts");
			System.out.println("4. Exit");
			System.out.println("Choose number: ");
			
			String name, phoneNumber;
			int numChoice = scan.nextInt();
			scan.nextLine();
			
			switch (numChoice) {
				case 1:
					System.out.println("Adding a contact...");
					System.out.print("Name = ");
					name = scan.nextLine();
					System.out.print("Phone Number = ");
					phoneNumber = scan.nextLine();
					abp.add(name, phoneNumber);
					break;
				case 2:
					System.out.println("Search phone number by Name");
					name = scan.nextLine();
					abp.search(name);
					break;
				case 3:
					abp.display();
					break;
				case 4:
					scan.close();
					abp.exit();
			}
		}
	}
}

class AddressBookProcess{
	HashMap<String, String> contacts = new HashMap<>();
	
	public void add(String name, String phoneNumber) {
		contacts.put(name, phoneNumber);
		System.out.println("Added a contact.\n");
	}
	public void search(String name) {
		if (contacts.containsKey(name)) {
			System.out.println(contacts.get(name) + "\n");
		}
		else {
			System.out.println("No contact for " + name + "\n");
		}
	}
	public void display() {
		System.out.println("All contacts...");
		for (String name: contacts.keySet()) {
			System.out.printf("%s (%s)\n\n", name, contacts.get(name));
		}
	}
	public void exit() {
		System.out.println("Exiting program.");
		System.exit(0);
	}
}
