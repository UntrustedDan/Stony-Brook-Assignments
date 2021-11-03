import java.util.Scanner;
public class Lab3_Part_1 {

	public static void main(String[] args) {
		double in, out;
		System.out.print("Enter degrees in Celsius to convert to Fahrenheit: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextDouble();
		out = (9.0/5) * in + 32;
		System.out.println(in + " degrees Celsius is equal to " + out + " degrees Fahrenheit.");
		stdin.close();
	}

}
