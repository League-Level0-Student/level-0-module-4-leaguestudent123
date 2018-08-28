import javax.swing.JOptionPane;

public class plotTwist {
	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog(null, "you're walking in a cave with your partner,\n"
				+ " you stumble across a deep hole.  at the same time, your partner nearly falls in the all the way in the hole\n"
				+ ",but at the same time, you find treasure. what do you do?\n"
				+ "A) Leave your partner and take the treasure.\n" + "B) Leave the treasure and save your partner.");

		if (a.equalsIgnoreCase("a")) {
			String b = JOptionPane.showInputDialog(null,
					"after you leave your partner, a family of sankes. What do you do?\n" + "C) try to kill them\n"
							+ "D) drop your treasure and RUN!!!!!!!!!!!!!!!!");

			if (b.equalsIgnoreCase("C")) {
				JOptionPane.showMessageDialog(null, "You die");

			} else if (b.equalsIgnoreCase("D")) {
				JOptionPane.showMessageDialog(null, "you lose your treasure, but lose the snakes");

			}
		} else if (a.equalsIgnoreCase("b")) {
			String c = JOptionPane.showInputDialog(null, "you and your partner help each other and find help.\n"
					+ "then your partner betays you. What do you do??\n" + "C)kill him" + "D)talk him out of it ");

			if (c.equalsIgnoreCase("C")) {
				JOptionPane.showMessageDialog(null, "You live but he dies");

			} else if (c.equalsIgnoreCase("D")) {
				JOptionPane.showMessageDialog(null, "You die but he doesn't");

			}

		}

	}

}