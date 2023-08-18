/*Create a class named ArrayListMain add main method to it.
create a static variable of Arrays ist that can hold string objects. has started screen share, choose Options to view
Define a static method named addobject Tai ist, this method will not return any value and will not have any parameter
- accept a string from the user and store in the ArrayList object Define a static method named getobjectFromList, this method will return a String object and will not have any parameter
accept an index position from the user and return the object stored in that position
Define a static method named displayAllobjectFontist, this method will not and will not have any parameter - display all the objects using Iterator or for loop or enhanced for loop use any one
Define a static method named removeObjectUsing Index, this method will not and will not have any parameter - accept an index position from the user and remove the object from ArrayList
Define a static method named removeObjectusingName, this method will not and will not have any parameter accept string from the user and remove the object.
Define a static method named updateTheobjectusing Index, this method will not and will not have any parameter - accept and index position and string from the user and update the object,
In the main method create a menu
1. Add object to ArrayList
2. Get Object based on index position
3. Display All objects from the ArrayList 4. Remove object using index from ArrayList
5. Remove object using object from ArrayList
6. Update object in the Arrayt ist
7. Exit*/

package com.labProblem;

import java.util.*;

public class Problem1 {
	static Scanner scanner = new Scanner(System.in);

	public static void updateObjectUsingIndex() {

		System.out.print("Enter a string to add to the ArrayList: ");
		String input = scanner.nextLine();
		stringArrayList.add(input);
		System.out.println("String added to the ArrayList.");
	}

	public static void removeObjectUsingName() {

		System.out.print("Enter the string to remove: ");
		String input = scanner.nextLine();
		if (stringArrayList.contains(input)) {
			stringArrayList.remove(input);
			System.out.println("Object removed: " + input);
		} else {
			System.out.println("Object not found in the ArrayList.");
		}
	}

	public static void removeObjectUsingIndex() {

		System.out.print("Enter the index position to remove: ");
		int index = scanner.nextInt();
		if (index >= 0 && index < stringArrayList.size()) {
			stringArrayList.remove(index);
			System.out.println("Object removed from index " + index);
		} else {
			System.out.println("Invalid index position.");
		}
	}

	public static void displayAllObjectsFromList() {
		System.out.println("Objects in the ArrayList:");
		for (String object : stringArrayList) {
			System.out.println(object);
		}
	}

	public static void getObjectFromList() {

		System.out.print("Enter the index position: ");
		int index = scanner.nextInt();
		if (index >= 0 && index < stringArrayList.size()) {
			String object = stringArrayList.get(index);
			System.out.println("Object at index " + index + ": " + object);
		} else {
			System.out.println("Invalid index position.");
		}
	}

	public static void addObjectToList() {

		System.out.print("Enter a string to add to the ArrayList: ");
		String input = scanner.nextLine();
		stringArrayList.add(input);
		System.out.println("String added to the ArrayList.");
	}

	static ArrayList<String> stringArrayList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Add object to ArrayList");
			System.out.println("2. Get Object based on index position");
			System.out.println("3. Display All objects from the ArrayList");
			System.out.println("4. Remove object using index from ArrayList");
			System.out.println("5. Remove object using name from ArrayList");
			System.out.println("6. Update object in the ArrayList");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addObjectToList();
				break;
			case 2:
				getObjectFromList();
				break;
			case 3:
				displayAllObjectsFromList();
				break;
			case 4:
				removeObjectUsingIndex();
				break;
			case 5:
				removeObjectUsingName();
				break;
			case 6:
				updateObjectUsingIndex();
				break;
			case 7:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 7);

		scanner.close();
	}
}
