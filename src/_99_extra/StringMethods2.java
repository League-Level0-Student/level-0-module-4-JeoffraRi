package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class StringMethods2 {
	
	
	public static void main(String[] args) {
		Random randoMan = new Random();
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String AtoZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String  randCase = "";
		
		for (int i=0;i<10;i++) {
			int nameOfYourOwn = randoMan.nextint
			System.out.println(nameOfYourOwn);
			
			String RowansNose = AtoZ.charAt(nameOfYourOwn) + "";
			randCase = RowansNose+randCase;	
			
		}
		
		// 2. Print your String to the console in upper case.
		System.out.println(randCase);
		// 3. Print your String to the console in lower case.

		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	}
}
