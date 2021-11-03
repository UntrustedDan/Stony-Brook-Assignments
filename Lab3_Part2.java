import java.util.Scanner;
public class Lab3_Part2 {
	public static void main(String[] args) {
		double m, q, f1, f2;
		System.out.print("Enter mass of water in kilograms: ");
		Scanner stdin = new Scanner(System.in);
		m = stdin.nextDouble();
		System.out.print("Enter initial temperature of water: ");
		f1 = stdin.nextDouble();
		System.out.print("Enter final temperature of water: ");
		f2 = stdin.nextDouble();
		q = m * (f2 - f1) * 4184;
		System.out.print("Energy required is " + q + ".");
		stdin.close();
	}
}
