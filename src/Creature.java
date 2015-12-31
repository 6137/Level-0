import javax.swing.JOptionPane;
public class Creature {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		
		String animal = JOptionPane.showInputDialog("What animal do you like?");
		
		if  (animal.equalsIgnoreCase( "dog")) {
			JOptionPane.showMessageDialog(null, "Dogs go woof!");
		}
		else if  (animal.equalsIgnoreCase( "cat")) {
			JOptionPane.showMessageDialog(null, "Cats go meow!");
		}
		else if  (animal.equalsIgnoreCase( "duck")) {
			JOptionPane.showMessageDialog(null, "Ducks go quack!");
		}
		else if  (animal.equalsIgnoreCase( "cow")) {
			JOptionPane.showMessageDialog(null, "Cows go moo!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Unknown creature.");
		}
		
		
		
		
	}
}
}
