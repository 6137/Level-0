import javax.swing.JOptionPane;

public class BO{
	int age = 0;
	public static void main(String[] args) {
	for (int i = 10; i > 0; i--) {
		speak(i + "");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);

}

	System.out.println("Blast Off");
	speak("Blast Off");
JOptionPane.showMessageDialog(null, "Blast Off");

	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

