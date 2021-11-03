//Daniel Grabowski, 112234272
import java.util.Scanner;
public class Homework1_Part2 {
	public static void main(String[] args) {
		double ta, v, twc;
		boolean q1 = false, q2 = false;
		System.out.print("Input outside temperature: ");
		Scanner stdin = new Scanner(System.in);
		ta = stdin.nextDouble();
		while(q1 == false){
			if(ta < -58 || ta > 41) {
				System.out.print("Invalid temperature. Input a value between -58 and 41: ");
				ta = stdin.nextDouble();
			}
			else {
				q1 = true;
			}
		}
		System.out.print("Input wind speed: ");
		v = stdin.nextDouble();
		while(q2 == false) {
			if(v<=1) {
				System.out.print("Invalid wind speed. Input a value greater than 1: ");
				v = stdin.nextDouble();
			}
			else {
				q2 = true;
			}
		}
		twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
		System.out.print("Wind-chill temperature is " + twc);
		stdin.close();
	}

}
