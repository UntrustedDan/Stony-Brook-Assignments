//Daniel Grabowski, 112234272
import java.util.*;
public class Homework2_Part4 {
	static boolean isPalindrome(String in) {
		in = in.toLowerCase();
		in = in.replaceAll("\\s", "");
		String in_r = new StringBuilder(in).reverse().toString();
		if(in.equals(in_r)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String in;
		System.out.print("Input string: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextLine();
		if(isPalindrome(in) == true) {
			System.out.print(in + " is a palindrome");
		}
		else {
			System.out.print(in + " is not a palindrome");
		}
		stdin.close();

	}

}
