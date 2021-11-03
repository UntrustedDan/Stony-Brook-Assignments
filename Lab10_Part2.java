import java.util.Scanner;

public class Lab10_Part2 {

	public static void main(String[] args) {
		String ssn;
		System.out.print("Enter SSN: ");
		Scanner stdin = new Scanner(System.in);
		ssn = stdin.nextLine();
		boolean c = ssn.matches("^[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]$");
		if(c==true) {
			System.out.print("Valid SSN Provided");
		}
		else {
			System.out.print("Invalid SSN Provided");
		}
		stdin.close();
	}

}
