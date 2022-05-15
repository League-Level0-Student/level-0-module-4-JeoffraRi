package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	
	
	
	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	boolean canPlaySounds = true;
	
	String PiDigits = "3.141592653589793";
	System.out.println(PiDigits.charAt(0));
	System.out.println(PiDigits.charAt(1));
	System.out.println(PiDigits.charAt(2));
	System.out.println(PiDigits.charAt(3));
	JOptionPane.showMessageDialog(null, "You've seen the first 3 digits of Pi, now it's time to show 17 more digits!");

	System.out.println("More digits down below!");	
	System.out.println(" |");
	System.out.println(" |");
	System.out.println(" |");
	System.out.println(" V");
	for(int a=0;a<21;a++) {
	System.out.println(PiDigits.charAt(a));
	if (canPlaySounds) {
	}
	if (canPlaySounds) {
		 speak(PiDigits.charAt(a)); 
	}
}
}
	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.

	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1

//Rowan = telephone 
	// 4. Print ALL the digits of the Pi String, putting each digit on a new line  (hint: use a loop)

	// 5. Skip this step if your computer cannot play sounds. 

	
	
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ characterToSpeak + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


