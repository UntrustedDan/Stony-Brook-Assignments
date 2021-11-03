import java.util.*;
public class Hello_World {
	public static boolean checkPalindrome(int x) {
		String S_in;
		StringBuilder RS_in = new StringBuilder();
		boolean isPalindrome=false;
		S_in = String.valueOf(x);
		RS_in.append(S_in);
		RS_in.reverse();
		System.out.println(RS_in);
		System.out.println(S_in);
		if(RS_in.toString().equals(S_in)) {
			isPalindrome=true;
		}
		return isPalindrome;
	}
	public static boolean checkReversePrime(int x) {
		boolean isPrime=true;
		int n = String.valueOf(x).length();
		int rev_x=0;
		for(int i=0;i<n;i++) {
			rev_x += (int) ((x%10)*Math.pow(10, n-i-1));
			x /= 10;
		}
		//System.out.println(x);
		for(int i=2; i<rev_x&&isPrime==true; i++) {
			//System.out.println(rev_x%i);
			if(rev_x%i==0) {
				isPrime = false;
			}
		}
		//System.out.print(rev_x);
		return isPrime;
	}
	
	public static void main (String [ ] args) {
		System.out.print("input: ");
		Scanner stdin = new Scanner(System.in);
		int in = stdin.nextInt();
		boolean isPalindrome = checkReversePrime(in);
		System.out.print(isPalindrome);
	}

}
