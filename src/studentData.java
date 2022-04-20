import java.util.Scanner;

public class studentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int choice;
		String cont = "yes";
		String nocont = "no";
		/*
		- the following arrays list ten students, as well as their favorite food and hometown
		- the arrays are listed in order with each other based on their index so that
		- the user's selection will correspond to the accurate item in each array via the "choice" integer variable
		- Author @JacksonConvis
		*/
		String[] studentsArr = { "0/null", "Jack", "Josh", "Brendan", "Brady", "Nate", "Loren", "Kelly", "Emma",
				"Andrea", "Michelle" };
		String[] favArr = { "0/null", "Shawarma", "Tacos", "Ice Cream", "Chili-Dogs", "Hot Pockets", "Pizza", "Wings",
				"Pickles", "Burgers", "Chicken" };
		String[] hmtwnArr = { "0/null", "Brighton", "Fenton", "Benton", "Howell", "Pinckney", "Lakeland", "Flint",
				"Tecumseh", "Detroit", "Lansing" };

		String yesorno;
		do {
			System.out.println(
					"Welcome to our Java class. Which student would you like to learn more about? (Enter a number 1-10)");

			try {
				choice = scan.nextInt();
				String test = studentsArr[choice];
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error! Please input a valid student identification number, let's try again");
				choice = scan.nextInt();

			}

			String name = studentsArr[choice];
			String hometown = hmtwnArr[choice];
			String food = favArr[choice];

			System.out.println("Student " + choice + " is " + name
					+ " What would you like to know about them? (enter “hometown” or “favorite_food”)");

			String input = scan.next();
			
			if (input.equalsIgnoreCase("hometown")) {
				System.out.println(name + "'s hometown is " + hometown + " would you like to learn more? (yes/no)");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("yes")) {
					System.out.println(name + " from " + hometown + "'s favorite food is " + food);
				}
			} else if (input.equalsIgnoreCase("favorite_food")) {
				System.out.println(name + "'s favorite dish is " + food + " would you like to learn more? (yes/no)");
				String ny = scan.next();
				if (ny.equalsIgnoreCase("yes")) {
					System.out.println(name + " is from " + hometown);
				}
			}
			System.out.println("would you like to learn about another student? (yes/no)");
			yesorno = scan.next();
			
		} while (yesorno.equalsIgnoreCase(cont));
		System.out.println("Thanks! Have a great day!");

	}

}
