package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class StringMethods2 {
	
	
	public static void main(String[] args) {
		
	
		//JOptionPane.showMessageDialog(null, "ROWAN! ROWAN! He's in the HOUSE!\n ROWAN! His LEGS ARE! As thin as a mouse! \nHe's so good at coding he can beat APPLE! Microsoft's no match for his GRAPPLE! \n So that's the tale of big ol' ROWAN! Now go, scram! And stop doin' that DRAWIN'!");
		
		Random randoMan = new Random();
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String AtoZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String  randCase = "";
		
		for (int i=0;i<AtoZ.length();i++) {
			int nameOfYourOwn = randoMan.nextInt(AtoZ.length());
			System.out.println(nameOfYourOwn);
			
			String RowansNose = AtoZ.charAt(nameOfYourOwn) + "";
			randCase = RowansNose+randCase;	
			
		}
		System.out.println("In random case:");
		System.out.println("----------------------------");
		System.out.println(randCase);
		// 2. Print your String to the console in upper case.
		System.out.println("In upper case:");
		System.out.println("----------------------------");
		System.out.println(randCase.toUpperCase());
		// 3. Print your String to the console in lower case.
		System.out.println("In lower case:");
		System.out.println("----------------------------");
		System.out.println(randCase.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(randCase.substring(0,3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		  
		 
	}
}