
	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;

	public class Tortous {
		public static void main(String[] args) {

		
			
			
			
			
			for (int i = 0; i < 30; i++) {
				
			
			String  color;
			//3. ask the user what color they would like the tortoise to draw
			color = JOptionPane.showInputDialog("What color would you like?");
			//4. use an if/else statement to set the pen color that the user requested
			if(color.equalsIgnoreCase("Red")){
				
				Tortoise.setPenColor(Color.red);
			}
if(color.equalsIgnoreCase("Orange")){
				
				Tortoise.setPenColor(Color.orange);
			}
if(color.equalsIgnoreCase("Yellow")){
	
	Tortoise.setPenColor(Color.yellow);
}
if(color.equalsIgnoreCase("Green")){
	
	Tortoise.setPenColor(Color.green);
}
if(color.equalsIgnoreCase("Blue")){
	
	Tortoise.setPenColor(Color.blue);
}
if(color.equalsIgnoreCase("Purple")){
	
	Tortoise.setPenColor(Color.magenta);
}
if(color.equalsIgnoreCase("Black")){
	
	Tortoise.setPenColor(Color.black);
}
if(color.equalsIgnoreCase("Cyan")){
	
	Tortoise.setPenColor(Color.CYAN);
}
	
	
				
	//5. if the user doesn’t enter anything, choose a random color
else{
	
	Tortoise.setPenColor(Colors.getRandomColor());
}
	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			Tortoise.setPenWidth(10);
		//1. make the tortoise draw a shape (this will take more than one line of code)
		for (int a = 0; i < 100; i++) {
			
		Tortoise.setSpeed(10);
		Tortoise.move(100);
		Tortoise.turn(79);
		
		}
		Tortoise.move(80);
		
		for (int a = 0; i < 300; i++) {
			
			Tortoise.setSpeed(10);
			Tortoise.move(100);
			Tortoise.turn(79);
	}
		Tortoise.move(80);
		
		for (int a = 0; i < 400; i++) {
			
			Tortoise.setSpeed(10);
			Tortoise.move(100);
			Tortoise.turn(79);
		
			Tortoise.move(80);
			
			for (int b = 0; i < 400; i++) {
				
				Tortoise.setSpeed(10);
				Tortoise.move(100);
				Tortoise.turn(79);
}
}
			}
	}
	}