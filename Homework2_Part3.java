//Daniel Grabowski, 112234272
import java.util.*;
public class Homework2_Part3 {

	public static void main(String[] args) {
		String s1, s2, p = "";
		System.out.print("Enter the first string: ");
		Scanner stdin = new Scanner(System.in);
		s1 = stdin.nextLine();
		System.out.print("Enter the second string: ");
		s2 = stdin.nextLine();

		//Iterate through each character in each string, compare, and add to prefix string
		int i = 0;
		while(i<(s1.length() - 1)&&i<(s2.length() - 1)) {
			if(s1.charAt(i)==s2.charAt(i)) {
				p += s1.charAt(i);
			}
			else {
				break;
			}
			i++;
		}
		if(i == 0) {
			System.out.print("No common prefix!");
		}
		System.out.print(p);
		stdin.close();

	}

}
