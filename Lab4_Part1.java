import java.util.Scanner;
public class Lab4_Part1 {

	public static void main(String[] args) {
		double i , p , r;
		System.out.print("Enter balance and interest rate in whole number form (e.g., 3 for 3%): ");
		Scanner stdin = new Scanner(System.in);
		p = stdin.nextDouble();
		r = stdin.nextDouble();
		i = p*(r/1200.0);
		System.out.print("The interest accured is " + i + ".");
		stdin.close();

	}

}
