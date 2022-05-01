package _02_boolean._2_star_student;

import javax.swing.JOptionPane;

public class StarStudent {
	
	public static void main(String[] args) {
		
		// booleans may be passed as parameters in method calls just like an
		// an int or any other kind of value. 
		
		// 1. Initialize passedExam to a value.

		boolean passedExam;
		String name = JOptionPane.showInputDialog(null, "<html>Enter your name to play <i>Childhood: An RPG</i></html>");
		JOptionPane.showMessageDialog(null, "Oh no! You've come across the Dad Sphinx! You must answer his riddles to pass!");
		String question = JOptionPane.showInputDialog(null, "\""+name+", Did you pass the test?\"");
		
		// 2. Call the didYouPass method with the variable you just initialized
		//    as the parameter so that it shows a pop-up.
		if (question.equalsIgnoreCase("yes")) {
			passedExam = true;
		}else {
			passedExam = false;
		}
		// The "not" operator (!) can be placed before a boolean value to 
		// temporarily "flip" the value between true and false.
		
		// 3. Use a ! on the boolean variable in either your method call or in 
		//    the didYouPass method itself to get the other pop-up to show 
		//    without changing the original value you gave to passedExam.
		didYouPass(passedExam);
	}
	
	public static void didYouPass(boolean passedExam) {
		
		if(passedExam) {
			JOptionPane.showMessageDialog(null, "\"Hmph. Okay, you can go.\"");
		}
		else if (!passedExam){
			JOptionPane.showMessageDialog(null, "\"Next time DO BETTER!\"");
		}else {
			JOptionPane.showMessageDialog(null, "\" I need a yes or no!\"");
		}
		
	}

}

// be right back





