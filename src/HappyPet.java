//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int  happinesslevel=0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String a=JOptionPane.showInputDialog(null,"What kind of pet do like to have?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Would you like to.....", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "clean", "feed", "walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void clean() {
		JOptionPane.showMessageDialog(null, "OH NO!!!!");
		happinesslevel=happinesslevel+3;
	}
	
	static void feed() {
		JOptionPane.showMessageDialog(null, "Thats so GOOd!");
		happinesslevel=happinesslevel+5;
	}
	
	static void walk() {
		JOptionPane.showMessageDialog(null, "that's was a good walk");
		happinesslevel=happinesslevel+3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





























































































































































































































































































































