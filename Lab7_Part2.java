import java.util.Scanner;

public class Lab7_Part2 {

	public static void main(String[] args) {
		double n, s, a;
		System.out.print("Enter the number of sides: ");
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextDouble();
		System.out.print("Enter the length of the sides: ");
		s = stdin.nextDouble();
		a = (n * Math.pow(s, 2))/(4*Math.tan(Math.PI/n));
		System.out.print("The area of the polygon is " + a);
		stdin.close();
	}

}
