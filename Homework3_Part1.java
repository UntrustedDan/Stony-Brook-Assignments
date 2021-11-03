//Daniel Grabowski, 112234272
import java.util.*;
public class Homework3_Part1 {
	
	public static String dec2Bin(int value) {
		String rbin = "";
		while(value > 1) {
			if(value%2 == 1) {
				rbin += "1";
			}
			else{
				rbin += "0";
			}
			value /= 2;
		}
		if(value == 1) {
			rbin += "1";
		}
		else {
			rbin += "0";
		}
		StringBuilder bin = new StringBuilder();
		bin.append(rbin);
		bin.reverse();
		return bin.toString();
		
	}

	public static void main(String[] args) {
		int dec;
		String bin;
		System.out.print("Enter a number in base-ten: ");
		Scanner stdin = new Scanner(System.in);
		dec = stdin.nextInt();
		bin = dec2Bin(dec);
		System.out.print(bin);
		stdin.close();
	}

}
