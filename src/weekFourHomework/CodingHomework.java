package weekFourHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	/*
	 * Create a new menu driven application using a List instead of an array. 
	 * The application should allow the user to manage a friends list.
	 * The application should have the following options:
	 * 1) Display All Friends
	 * 2) Add New Friend
	 * 3) Delete All Friends
	 * 4) Delete A Friend
	 * 
	 * In a different class, create an ArrayList, HashSet, and HashMap.
	 * Add at least three entries to each collection.
	 * Iterate over each collection and print out the contents.
	 */

	public class CodingHomework {
		static Scanner sc = new Scanner(System.in);
		static List<String> friends = new ArrayList<String>();
		//static String userChoice = "";
	
		public static void main(String[] args) {
			int decision = 0;
			while (decision != 5) {
				showMenu();
				
				decision = getUserInput();
				//userChoice = getUserChoice();
				if (decision == 1) {
					showFriendList();
				} else if (decision == 2) {
					addFriend();
				} else if (decision == 3) {
					deleteAllFriends();
				} else if (decision == 4) {
					deleteAFriend();
				} else if (decision == 5) {
					System.out.println("Goodbye!");
				} else {
					System.out.println("Please pick a valid option.");
				}
			}
	
		}
		
		public static void showMenu() {
			System.out.println("1) Print friend list");
			System.out.println("2) Add a friend to the list");
			System.out.println("3) Delete the friend list");
			System.out.println("4) Delete a friend from the list");
			System.out.println("5) Exit");
			System.out.println("---------------------------");
			System.out.print("Pick an option: ");
			
		}
		
		public static int getUserInput() {
			return sc.nextInt();
		}
		
		public static String getUserChoice() {
			return sc.next();
		}
		
		public static void showFriendList() {
			System.out.println(friends);
		}
		
		public static void addFriend() {
			System.out.print("Who do you want to add: ");
			String friend = sc.next();
			friends.add(friend);
			System.out.println("Friend added to list: " + friend);
		}
		
		public static void deleteAllFriends() {
//			System.out.println("Are you sure you want to delete the WHOLE list? Yes or No: ");
//			userChoice = getUserChoice();
//			if (userChoice == "Yes") {
				friends.clear();
//			} else {
//				showMenu();
//			}
		}
		
		public static void deleteAFriend() {
			System.out.print("What is the index number of the friend to delete: ");
			int id = getUserInput();
			if (id < friends.size()) {
				friends.remove(id);
			}
			
		}
		
}
