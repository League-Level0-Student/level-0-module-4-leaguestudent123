

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog( null, "whats your favorite color, red or blue");
	JOptionPane.showMessageDialog( null, a+ " is my favortie color too");
	Robot bob = new Robot();
	if(a.equalsIgnoreCase("red")) {
	bob.setPenColor(Color.RED);
	}
	if(a.equalsIgnoreCase("blue")) {
		bob.setPenColor(Color.blue);
	}
	bob.penDown();
	bob.setSpeed(5);
	bob.turn(180);
		bob.move(100);
		bob.turn(120);
		bob.move(100);
		bob.turn(120);
		bob.move(100);
}
}
