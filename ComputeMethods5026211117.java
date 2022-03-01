import java.util.Random;

public class ComputeMethods5026211117 {

	public double fToC(double degreesF){
		return 5 / 9.0 * (degreesF - 32); //Counting temperature
	}
	
	public double hypotenuse(int a, int b) {
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); //Counting hypotenuse
	}
	
	public int roll() {
		Random random = new Random();
		int firstDice = random.nextInt(6); //Get the value of the 1st dice
		int secondDice = random.nextInt(6); //Get the value of the 2nd dice
		return firstDice + secondDice;
	}
}