//Add tasks to the list.
//Remove tasks from the list.
//Mark tasks as completed.
//Display the list of tasks.
//Optionally, save the list to a file and load it back.

package week5_collection_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1_ToDoList {
	public static void main(String[] args) {
		List<String> toDoLists = new ArrayList<>();
		List<String> completedLists = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Do-ner!");
		System.out.println("-------------------");
		
		while(true) {
			
			System.out.println("Add[a] tasks to the list");
			System.out.println("Remove[r] tasks from the list");
			System.out.println("Mark[m] tasks as completed");
			System.out.println("Display[d] the list of tasks");
			System.out.println("Exit[e]");
			
			
			char character = scan.next().charAt(0);
			scan.nextLine();
			
			switch (character) {
				case 'a':
					System.out.println("Your tasks...");
					String task = scan.nextLine();
					if (task != "") {
						toDoLists.add(task);
						System.out.println(toDoLists + "\n");
					}
					break;
				case 'r':
					if (toDoLists.isEmpty()) {
						System.out.println("You have no task to remove.\n");
					}
					else {
						System.out.println("Removing the task from your list...");
						System.out.println("You have " + toDoLists + " to remove."); 
						task = scan.nextLine();
						if (toDoLists.remove(task)) {
							System.out.println("Task removed: " + task + "\n");
						}
						else {
							System.out.println("Task not found: " + task + "\n");
						}
					}
					break;
				case 'm':
					boolean completed = false;
					if (toDoLists.isEmpty()) {
						System.out.println("No task to mark as completed.\n");
					}
					else {
						System.out.println("Enter index number to mark as completed and you must start No. 0: ");
						int indexToCompleteTask = scan.nextInt();
						if (indexToCompleteTask >= 0 && indexToCompleteTask < toDoLists.size()) {
							completed = true;
							if (completed = true) {
								System.out.println("Task marked as completed: " + toDoLists.get(indexToCompleteTask) + "\n");
								completedLists.add(toDoLists.get(indexToCompleteTask));
								System.out.println("Completed tasks: " + completedLists + "\n");
								toDoLists.remove(indexToCompleteTask);
							}
							}
						else {
							System.out.println("Invalid task index.\n");
						}
					}
					break;
				case 'd':
					int taskNum = 1;
					int completedTaskNum = 1;
					if (toDoLists.isEmpty())
					{
						System.out.println("No Lists!");
					}
					else {
						System.out.println("Your Lists...");
						for (String eachTask: toDoLists) {
							System.out.println(taskNum + "." + eachTask + "\n");
							taskNum ++;
						}
					}
					System.out.println("-----------------");
					if (completedLists.isEmpty()) {
						System.out.println("No completed Lists!\n");
					}
					else {
						System.out.println("Your completed Lists...");
						for (String eachCompletedTask: completedLists) {
							System.out.println(completedTaskNum + "." + eachCompletedTask + "\n");
							completedTaskNum++;
						}
					}
					break;
				case 'e':
					System.out.println("Exiting program.");
					scan.close();
					System.exit(0);
			}
		}
	}
}



