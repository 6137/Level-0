

	 import java.util.Random;
		import javax.swing.JOptionPane;
	// Copyright Wintriss Technical Schools 2013
	public class HiLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(101);
			//Random r = new Random();
			//String = number;
			// 2. Print out the random variable above
			System.out.println(random);
			// 11. do the following 10 times
			
			
				
		 for (int i = 0; i < 10; i++) {
				// 1. ask the user for a guess using a pop-up window, and save their response 
				String number = JOptionPane.showInputDialog("Guess a # between 1 and 100!");
				int x = i;
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int s = Integer.parseInt(number);
				// 5. if the guess is correct
				if (s == (random)){
					
					JOptionPane.showMessageDialog(null, "You Won!!!!!");
					System.exit(0);
				}
					// 6. win
				// 7. if the guess is high
					else if (s < random){
						JOptionPane.showMessageDialog(null, "Too Low!");
					   JOptionPane.showMessageDialog(null, x );
					}
					// 8. tell them it's too high
					else if (s > random){
						JOptionPane.showMessageDialog(null,  "Too High!");
						   JOptionPane.showMessageDialog(null, x );
					}
				// 9. if the guess is low
					// 10. tell them it's too low
					
					}
		


				JOptionPane.showMessageDialog(null, "You Lose! You shall never win!!!!");

		
		}

	
		}
		
	
