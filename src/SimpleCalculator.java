
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String a = JOptionPane.showInputDialog(null, "Enter a number");
		int y = Integer.parseInt(a);
		String b = JOptionPane.showInputDialog(null, "Enter a number");
		int o = Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "would you like to.....", "Pop-up Title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multipy", "divide" }, null);

		if (operation == 0) {
			add(y, o);
		}
		if (operation == 1) {
			subtract(y, o);
		}
		if (operation == 2) {
			multiply(y, o);
		}
		if (operation == 3) {
			divide(y, o);
		}
	}

	// 5. Call the methods created in steps 3 and 4 to perform the appropriate
	// operation.

	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	// 3. Create method for addition operation.98765432
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2));	
	}
}
// 4. Create similar methods for subtraction, multiplication and division.


