

	// Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipies".
	 */
	public class Xgames {
	public static void main(String[] args) {

			// 1. Save the superpower for each person in a variable.
			String Aria =  "Invisiblility";
			String Lucas = "Ghost-Ability";
			String James = "Flying";
			String Conrad = "Superspeed";
			String Chloe = "Shapeshifting";
			String Eric = "Blinking";
			String Casy =  "Doing Nothing";
			// 2. Ask the user to enter a name. Store their answer in a variable.
				
				
			// 3. Show the superpower in a pop-up, depending on the name entered. 
				for (int i = 0; i < 1000000000; i++) {
					String answer = JOptionPane.showInputDialog("Would you like to know your superpower? Please enter your name. ");
					
				if (answer.equalsIgnoreCase("Aria")){
				JOptionPane.showMessageDialog(null,"Your super power is invisibility.");
				}
				
				
				else if (answer.equalsIgnoreCase("Lucas")){
					JOptionPane.showMessageDialog(null, "Your super power is Ghost-Ability.");
				}
				else if (answer.equalsIgnoreCase("James")){
					JOptionPane.showMessageDialog(null, "Your super power is flying.");
				}else if (answer.equalsIgnoreCase("Conrad")){
					JOptionPane.showMessageDialog(null, "Your super power is superspeed.");
				}else if (answer.equalsIgnoreCase("Chloe")){
					JOptionPane.showMessageDialog(null, "Your super power is shapeshifting.");
				}else if (answer.equalsIgnoreCase("Eric")){
					JOptionPane.showMessageDialog(null, "Your super power is blinking.");
				}else if (answer.equalsIgnoreCase("Casy")){
					JOptionPane.showMessageDialog(null, "Your super power is doing nothing.");
			
				}
				else  {
					JOptionPane.showMessageDialog(null, "You lack a super power! You can buy one for $100,000,000,000");
				}
		
				
				
				
				
		}
	}
	}

