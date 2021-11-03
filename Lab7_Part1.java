import java.util.Scanner;

public class Lab7_Part1 {
	
	public static void main(String[] args) {
		double x, y, d;
		System.out.print("Enter a point, x y: ");
		Scanner stdin = new Scanner(System.in);
		x = stdin.nextDouble();
		y = stdin.nextDouble();
		d = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		if(d<=10) {
			System.out.print("Point (" + x + ", " + y + ") is in the circle.");
		}
		else {
			System.out.print("Point (" + x + ", " + y + ") is not in the circle.");
		}
		stdin.close();
	}

}
