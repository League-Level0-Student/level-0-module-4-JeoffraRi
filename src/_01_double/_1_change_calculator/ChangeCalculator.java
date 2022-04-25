package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "Input number of nickels here.");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelsInt = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "Input number of dimes here."); 
int dimesInt = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "Input number of quarters here."); 
int quartersInt = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double monkey = (nickelsInt*5)+(dimesInt*10)+(quartersInt*25);
JOptionPane.showMessageDialog(null, "Okay, so this is how much monkey you have:");
JOptionPane.showMessageDialog(null, "<html>Oh wait, I mean this is how much <i>money</i> you have:<html>");
JOptionPane.showMessageDialog(null, ""+monkey+"");
		/*
		 *  weeeeee!!! kablourwdnksmaldbhwjna. No! Not dwiqjnksxneiwjk!
		 *  I surrrreee lovvveee monkeys! 
		 */
		JOptionPane.showMessageDialog(null, "💩");
		
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

