//Inventory Management System:
//
//Create a program to manage inventory items using an ArrayList of objects representing items.
//Implement functionalities such as adding items, removing items, updating quantities, and displaying the current inventory.

package com.inventory.management;

import java.util.ArrayList;

public class ManageInventory {
	public static void main(String[] args) {
		
	}
}

class Process{
	ArrayList<String> items = new ArrayList<>();
	int totalQuantity = 0;
	
	public void addItems(String item) {
		items.add(item);
	}
	
	public void removeItems(String item) {
		items.remove(item);
	}
	
	public void updateQuantity(int quantity) {
		totalQuantity += quantity;
	}
	
	public void display(String items, int quantities) {
		
	}
}
