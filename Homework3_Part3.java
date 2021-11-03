//Daniel Grabowski, 112234272
public class Homework3_Part3 {
	
	public static boolean checkPalindrome(int x) {
		String S_in;
		StringBuilder RS_in = new StringBuilder();
		boolean isPalindrome=false;
		S_in = String.valueOf(x);
		RS_in.append(S_in);
		RS_in.reverse();
		if(RS_in.toString().equals(S_in)) {
			isPalindrome=true;
		}
		return isPalindrome;
	}
	public static boolean checkPrime(int x) {
		boolean isPrime=true;
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	public static boolean checkReversePrime(int x) {
		boolean isPrime=true;
		int n = String.valueOf(x).length();
		int rev_x=0;
		for(int i=0;i<n;i++) {
			rev_x += (int) ((x%10)*Math.pow(10, n-i-1));
			x /= 10;
		}
		for(int i=2; i<rev_x; i++) {
			if(rev_x%i==0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		boolean newLine=true;
		for(int i=13,n=0;n<100;i++) {
			if(checkPalindrome(i) == false && checkPrime(i) == true && checkReversePrime(i)==true) {
				System.out.print(i + " ");
				n++;
				newLine=true;
			}
			if(n%10==0 && newLine==true) {
				System.out.println();
				newLine=false;
			}
		}
	}

}
