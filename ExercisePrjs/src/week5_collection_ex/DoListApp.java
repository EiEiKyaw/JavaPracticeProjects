package week5_collection_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoListApp {
	    private List<String> tasks;

	    public DoListApp() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String task) {
	        tasks.add(task);
	        System.out.println("Task added: " + task);
	    }

	    public void removeTask(String task) {
	        if (tasks.remove(task)) {
	            System.out.println("Task removed: " + task);
	        } else {
	            System.out.println("Task not found: " + task);
	        }
	    }

	    public void displayTasks() {
	        System.out.println("Tasks:");
	        for (String task : tasks) {
	            System.out.println(task);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DoListApp toDoList = new DoListApp();

	        while (true) {
	            System.out.println("\nOptions:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. Display Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task to add: ");
	                    String taskToAdd = scanner.nextLine();
	                    toDoList.addTask(taskToAdd);
	                    break;
	                case 2:
	                    System.out.print("Enter task to remove: ");
	                    String taskToRemove = scanner.nextLine();
	                    toDoList.removeTask(taskToRemove);
	                    break;
	                case 3:
	                    toDoList.displayTasks();
	                    break;
	                case 4:
	                    System.out.println("Exiting program.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }


}
