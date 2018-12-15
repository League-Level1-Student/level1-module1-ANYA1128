import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 *  Don't change the existing methods.
	 */    
	
	String flavor = JOptionPane.showInputDialog(null, "What flavor should the popcorn be?");
	Popcorn endgame = new Popcorn(flavor);
	Microwave hi = new Microwave();
	hi.putInMicrowave(endgame);
	String time = JOptionPane.showInputDialog(null, "How long should the popcorn stay in the microwave?") ;
	int timee = Integer.parseInt(time);
	hi.setTime(timee);
	hi.startMicrowave();
	endgame.eat();
}
}
