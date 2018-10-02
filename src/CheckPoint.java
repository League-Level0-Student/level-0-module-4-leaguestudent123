

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog(null, "What's your favorite color between pink or orange(yellowish)?");
	
	JOptionPane.showMessageDialog(null, a+" is my favorite color too!");
	
	 Robot bub = new Robot();
	  
	 if (a.equals("orange")) {
		 bub.setPenColor(Color.ORANGE);
	 }
	 
	 else {
		 bub.setPenColor(Color.PINK);
	}
	 
	 
	 for (int i = 0; i < 3; i++) {
		bub.setSpeed(10);
		 
		 bub.penDown();
		 
		 bub.move(100);
		 
	 bub.turn(120);
	}
	
	 
	 
}
}
