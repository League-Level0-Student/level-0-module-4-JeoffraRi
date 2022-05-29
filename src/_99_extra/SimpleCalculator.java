package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		JOptionPane.showMessageDialog(null, "This calculator can only do whole numbers! Decimals will show up as 0.");
		for (int i = 0;i<20;i++) {
		String number1 = JOptionPane.showInputDialog(null, "Give  me a random number.");
		String number2 = JOptionPane.showInputDialog(null, "Give  me another random number.");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);


		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Division", "Addition", "Subtraction", "Multiplication" },
				null);
		if (operation==0) {
			divide(num1,num2);
		}else if (operation==1) {
			add(num1,num2);
		}else if (operation==2) {
			subtract(num1,num2);
		}else if (operation==3) {
			multiply(num1,num2);
		}

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, ""+num1+" + "+num2+" = "+(num1+num2)+"");
	}
	static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, ""+num1+" - "+num2+" = "+(num1-num2)+"");
	}
	static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, ""+num1+" ÷ "+num2+" = "+(num1/num2)+"");
	}
	static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, ""+num1+" x "+num2+" = "+(num1*num2)+"");
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}