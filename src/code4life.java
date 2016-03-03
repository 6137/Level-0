import java.io.File;
import java.util.MissingFormatArgumentException;

import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class code4life {

	/*
	 * Ask the user how many hours they spent coding this week.
	 * 
	 * 1. If it's more than 3, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */
    
	public static void main(String[] args) {

		String x  = JOptionPane.showInputDialog(null, "How many hours have you spent coding this week?");
   int i =  Integer.parseInt(x);
    
		if( i>= 5){
			playBatmanTheme();
	}
		else if( i <= 1){
			System.out.println("You must stop watching YouTube and start coding.");
			
		}
		else if(i>= 4){
		
			System.out.println("You're a coding Ninja!!!!!!!!!!!!!!!!!!");
		}
		else{
			
			System.out.println("You are not a Ninja and don't watch too much YouTube. Keep coding for a few more hours to get a reward.");
		}
		
		
	}
	
	
	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

