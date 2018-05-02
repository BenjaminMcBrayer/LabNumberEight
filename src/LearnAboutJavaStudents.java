//Benjamin McBrayer, 5.1.2018
//This Java console program recognizes invalid inputs when the user requests information about students in a class.

import java.util.Scanner;

public class LearnAboutJavaStudents {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] studentNames = { "Veronika", "Henry", "Abigail", "Jackson", "Evelyn", "Liam", "Ella", "Otto",
				"Gabriella", "Pernelle" };
		String[] studentJobs = { "Odor Tester", "Full-Time Netflix Viewer", "MMA Fighter", "Librarian", "Hostler",
				"Cobbler", "Butler", "Handmaiden", "Henchman", "Matador" };
		String[] studentMascots = { "Banana Slugs", "Hilltoppers", "Golden Gophers", "Shockers", "Fighting Camels",
				"Dustdevils", "Mastodons", "Zips", "Titans", "Lady Firebirds" };
		String knowMore = null;
		String playAgain = null;
		int userNum;
		System.out.println("Welcome to our Java Class!");

		// Ask for user information; greet user.
		System.out.println(getUserNameAndSayHello(scnr));

		do {
			userNum = Validator.getInt(scnr, "Enter the number of the student about whom you would like to know more. ",
					1, 10);
			System.out.println("You have chosen " + studentNames[userNum - 1] + ".");
			System.out.println("What would you like to know about " + studentNames[userNum - 1] + "?");

			do {
				String userInput = Validator.getString(scnr,
						"For \"Dream Job,\" enter \"job.\" For \"Favorite Sports Mascot,\" enter \"mascot.\"");
					do {
						if (userInput.equalsIgnoreCase("job")) {
							System.out.println("Dream Job: " + studentJobs[userNum - 1]);
						} else if (userInput.equalsIgnoreCase("mascot")) {
							System.out.println("Favorite Sports Mascot: " + studentMascots[userNum - 1]);
						} else {
							System.out.println("That data does not exist. Please try again. Enter \"job\" or \"mascot.\"");
						} //FIX ME: Make this repeat the if and else if statements above (instead of leaving the loop).
					} while (userInput.equalsIgnoreCase("job") || userInput.equalsIgnoreCase("mascot"));
					
				knowMore = Validator.getString(scnr, "Would you like to know more about " + studentNames[userNum - 1] + "(y/n)?");

			} while (knowMore.equalsIgnoreCase("y"));

			System.out.println();
			playAgain = Validator.getString(scnr, "Would you like to learn about another student (y/n)?");

		} while (playAgain.equalsIgnoreCase("y"));
		
		//Bid the user adieu.
		System.out.println("Goodbye!");

		scnr.close();

	}

	public static String getUserNameAndSayHello(Scanner scnr) {
		System.out.print("Please enter your name: ");
		String userName = scnr.nextLine();
		return "Hello, " + userName + "!";
	}

}