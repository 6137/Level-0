import javax.swing.JOptionPane;

public class Riddle {


		public static void main(String[] args) {

			// 1. Make a variable to hold the score
				int score = 0;
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
				String riddle = JOptionPane.showInputDialog("Which word is spelled incorectly in the dictionary?");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if (riddle.equalsIgnoreCase("None")){
					JOptionPane.showMessageDialog(null,"Correct! 1/1");
					}
				else  {
					JOptionPane.showMessageDialog(null, "Wrong, the correct answer is NONE!0/1");
				}
				String rid =  JOptionPane.showInputDialog("What gets wet when drying?");
				 if(rid.equalsIgnoreCase("Towel")){
					 JOptionPane.showMessageDialog(null, "Correct! 1/1");
				 }
				 else {
					JOptionPane.showMessageDialog(null, "Wrong , the correct answer is Towel! 0/1");
				 }
				}
			// 5. Otherwise, say "wrong" and tell them the answer

			// 6. Add some more riddles

			// 2. Make a pop up to show the score.

		
			
		
	}
	

