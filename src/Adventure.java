import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	String k;
	String x;
	String a;
	k = JOptionPane.showInputDialog("You are treasure hunting in the forest. There is a fork in the road. Which do you choose--left or right?");
	
	if(k.equalsIgnoreCase ("left")){
		x = JOptionPane.showInputDialog("You see a tiger. What do you do? Would you run or try and camoflage and pretend it didn't see you.");
		if(x.equalsIgnoreCase("run")){
		JOptionPane.showMessageDialog(null, "You are chased for 60 miles and go home with nothing.");
		}
		else{
			JOptionPane.showMessageDialog(null,"You are eaten. ");
		}
		}
	
		else{
			a = JOptionPane.showInputDialog("You see an abandoned closet on the way. You can keep going or open the closet");
			if (a.equalsIgnoreCase("Open Closet")){
				
		JOptionPane.showMessageDialog(null, "You are attacked by a group of angry racoons and have to return home.");
			}
			else{
				
			JOptionPane.showMessageDialog(null, "You keep walking and find an old chest. You open it and find treasure. You win!");
			}
		}
	
	
	
	
	
}
}
