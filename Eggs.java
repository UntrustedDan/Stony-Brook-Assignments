//Daniel Grabowski, 112234272
import java.text.DecimalFormat;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		double n, p, dp = 3.25, sp = 0.45;
		DecimalFormat two = new DecimalFormat("0.00");
		System.out.print("Enter amount of eggs you wish to buy: ");
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextDouble();
		if(n%12==0) {
			double a = n/12;
			p = a * dp;
			System.out.print("You ordered " + (int)n + " eggs. That's " + (int)a + " dozen eggs at $3.25 per dozen for a total of $" + two.format(p) + ".");
		}
		else {
			double da = (n-(n%12))/12;
			double sa = n%12;
			p = (da*dp)+(sa*sp);
			System.out.print("You ordered " + (int)n + " eggs. That's " + (int)da + " dozen eggs at $3.25 per dozen and " + (int)sa + " loose eggs at 45 cents for a total of $" + two.format(p) + ".");
		}
		stdin.close();
	}

}
