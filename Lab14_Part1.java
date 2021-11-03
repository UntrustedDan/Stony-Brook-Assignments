import java.util.*;
public class Lab14_Part1 {
	public static double area(double side) {
		double a, num, dem;
		num = 5 * Math.pow(side, 2);
		dem = 4 * Math.tan(Math.PI / 5);
		a = num / dem;
		return a;
	}

	public static void main(String[] args) {
		double in;
		System.out.print("input: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextDouble();
		System.out.print(area(in));
		stdin.close();
	}

}
