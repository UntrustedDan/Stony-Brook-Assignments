import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab6_Part2 {

	public static void main(String[] args) {
		double d, mpg, ppg, c;
		DecimalFormat two = new DecimalFormat("0.00");
		System.out.println("Input the following. \nDistance to drive: ");
		Scanner stdin = new Scanner(System.in);
		d = stdin.nextDouble();
		System.out.println("MPG rating of your car: ");
		mpg = stdin.nextDouble();
		System.out.println("Cost of fuel per gallon: ");
		ppg = stdin.nextDouble();
		c = (d / mpg) * ppg;
		System.out.print("The cost of driving is: $" + two.format(c));
		stdin.close();

	}

}
