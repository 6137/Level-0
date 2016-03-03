import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String k;
	String x = JOptionPane.showInputDialog(null,"How old are you?");
	int i = Integer.parseInt(x);
	
	if (i >= 18) {
	k =	JOptionPane.showInputDialog(null,"Which president are you going to vote for? (Last name only)");
	if(k.equalsIgnoreCase("trump")){
		JOptionPane.showMessageDialog(null,"Really? You want to build a wall?");
		
	}
	else{
		
	JOptionPane.showMessageDialog(null,"Good Choice!");
	}
	}
	else{
		JOptionPane.showMessageDialog(null,"You're going to have to grow up and vote for the next president.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
