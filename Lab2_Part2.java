import java.util.Scanner;
public class Lab2_Part2 {
	public static void main(String[] args) {
		double v0, v1, t, a;
		System.out.println("Enter the starting velocity: ");
		Scanner stdin = new Scanner(System.in);
		v0 = stdin.nextDouble();
		System.out.println("Enter the final velocity: ");
		v1 = stdin.nextDouble();
		System.out.println("Enter the total time spent accelerating: ");
		t = stdin.nextDouble();
		a = (v1 - v0) / t;
		System.out.println("Average acceleration is equal to " + a + ".");
		stdin.close();
	}
}
