import java.util.Random;

import javax.swing.JOptionPane;

public class GuessGame {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "guess that number!! 0,1,2?");
		int d = Integer.parseInt(a);
		Random b = new Random();
		int c = b.nextInt(3);

		System.out.println(a);
		if (c == d) {
			JOptionPane.showMessageDialog(null, "right!!!");
		} else {
			JOptionPane.showMessageDialog(null, "second chance!!!");
			String f = JOptionPane.showInputDialog(null, "guess that number!! 0,1,2?");
			int e = Integer.parseInt(f);
			if (e==c) {
				JOptionPane.showMessageDialog(null, "right!!!");
			}else {
				
			
			JOptionPane.showMessageDialog(null, "wrong!!!!!!");
			}
		}
	}
}