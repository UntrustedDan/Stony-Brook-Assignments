//Daniel Grabowski, 112234272
import java.util.Scanner;
public class Homework1_Part4 {

	public static void main(String[] args) {
		double s1,s2,s3;
		System.out.print("Input all 3 sides of your triangle: ");
		Scanner stdin = new Scanner(System.in);
		s1 = stdin.nextDouble();
		s2 = stdin.nextDouble();
		s3 = stdin.nextDouble();
		if(s1+s2 <= s3 || s1+s3 <= s2 || s3 + s2 <= s1) {
			System.out.print("That's not a triangle!");
		}
		else{
			if(s1 == s2 && s1 == s3) {
				System.out.print("Equilateral");
			}
			else if(s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.print("Isosceles");
			}
			else {
				System.out.print("Scalene");
			}
			
		}
		stdin.close();

	}

}
