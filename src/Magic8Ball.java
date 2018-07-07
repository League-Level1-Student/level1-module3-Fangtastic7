import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	// public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below….
	// ok
	// 2. Make a variable that will hold a random number and put a random number
	// into this variable using "new Random().nextInt(4)"
	// int r = new Random().nextInt(4);
	// 3. Print out this variable
	// System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
	// String question = JOptionPane.showInputDialog("What question do you want me
	// to answer for you?");
	// 5. If the random number is 0
	// }
	void answer() {
		int r = new Random().nextInt(4);
		if (r == 0) {
			JOptionPane.showMessageDialog(null, "Yes.");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		else if (r == 1) {
			JOptionPane.showMessageDialog(null, "No.");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		else if (r == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		else if (r == 3) {
			JOptionPane.showMessageDialog(null, "Your friend's wife is cheating on another guy.");
		}
		// -- write your own answer

	}
}
