import java.util.Random;

import javax.swing.JOptionPane;

public class fortuneTeller {
	public static void main(String[] args) {
		Random bub = new Random();

		int a = bub.nextInt(5);

		System.out.println(a);
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "you'll have good things happend to you");
		} else if (a == 1) {
			JOptionPane.showMessageDialog(null, "you get all the wishes in the world");
		} else if (a == 2) {
			JOptionPane.showMessageDialog(null, "you become the smartest person in the world");
		}

		else if (a == 3) {
			JOptionPane.showMessageDialog(null, "you get luck");
		} else if (a == 4) {
			JOptionPane.showMessageDialog(null, "you become rich!!$$");
		}

	}
}
