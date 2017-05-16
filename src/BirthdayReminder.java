
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "may 5th";
		String dadsBirthday = "july 30th";
		String myBirthday = "november 24th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String compare = JOptionPane.showInputDialog("whose birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(compare);
		// 4. if user asked for "mom"
		if (compare.equals("momsBirthday")) {
			System.out.println(momsBirthday);
		} else if (compare.equals("dadsBirthday")) {
			System.out.println(dadsBirthday);
		} else if (compare.equals("myBirthday")) {
			System.out.println(myBirthday);
		} else {
			System.out.println("sorry, dont have that stored");
		}

	}
}
