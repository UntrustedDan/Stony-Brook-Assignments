//Daniel Grabowski, 112234272
import java.util.Scanner;
public class Homework1_Part3 {

	public static void main(String[] args) {
		double i, i5, i6;
		boolean d_and = false, d_or = false, d_not = false;
		System.out.print("Enter an integer: ");
		Scanner stdin = new Scanner(System.in);
		i = stdin.nextDouble();
		i5 = i/5;
		i6 = i/6;
		
		if(i5%1 == 0 && i6%1 == 0) {
			d_and = true;
		}
		System.out.println(i + " Divisible by 5 and 6: " + d_and);
		
		if(i5%1 == 0 || i6%1 == 0) {
			d_or = true;
		}
		System.out.println(i + " Divisible by 5 or 6: " + d_or);
		
		if(d_and == false && d_or == true) {
			d_not = true;
		}
		System.out.println(i + " Divisible by 5 or 6, but not by both: " + d_not);
		
		stdin.close();

	}

}
