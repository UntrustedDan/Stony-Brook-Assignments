//Daniel Grabowski, 112234272
import java.util.*;
public class Homework3_Part2 {
	
	public static int bin2Dec(String binaryString) {
		int dec;
		StringBuilder rbin = new StringBuilder();
		rbin.append(binaryString);
		rbin.reverse();
		if(rbin.charAt(0) == '1') {
			dec = 1;
		}
		else {
			dec = 0;
		}
		for(int i=1; i<binaryString.length();i++) {
			if(rbin.charAt(i) == '1') {
				dec += Math.pow(2, i);
			}
		}
		return dec;
	}

	public static void main(String[] args) {
		String bin;
		int dec;
		System.out.print("Input binary number: ");
		Scanner stdin = new Scanner(System.in);
		bin = stdin.nextLine();
		dec = bin2Dec(bin);
		System.out.print(dec);
		stdin.close();
		

	}

}
