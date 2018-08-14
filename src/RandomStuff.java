import java.util.Random;

import javax.swing.JOptionPane;

public class RandomStuff {
public static void main(String[] args) {
	Random a=new Random();
	int y=a.nextInt(7);
	if (y==2) {
	JOptionPane.showMessageDialog(null, "hello");	
	}
	else if (y==7){
		JOptionPane.showMessageDialog(null, "goodbye");	
	}else if (y==7){
		JOptionPane.showMessageDialog(null, "how are you");		
	}else if (y==7){
		JOptionPane.showMessageDialog(null, "see you later");		
	}else if (y==7){
		JOptionPane.showMessageDialog(null, "good job");		
	}else if (y==7){
		JOptionPane.showMessageDialog(null, "you had one job");		
	}else {
		JOptionPane.showMessageDialog(null, "eggs");		
	}
}
}
