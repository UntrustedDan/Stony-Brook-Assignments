import java.util.Scanner;

public class Lab6_Part1 {

	public static void main(String[] args) {
		int in, R_in=0;
		String S_in;
		StringBuilder RS_in = new StringBuilder();
		System.out.print("Input a three-digit integer: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextInt();
		if(in<=0) {
			System.out.print("Invalid input.");
		}
		else {
			S_in = String.valueOf(in);
			RS_in.append(S_in);
			RS_in.reverse();
			R_in = Integer.parseInt(RS_in.toString());
			if(R_in == in) {
				System.out.print(in + " is a palindrome.");
			}
			else {
				System.out.print(in + " is not a palindrome.");
			}
		}
		stdin.close();
		
	}

}
