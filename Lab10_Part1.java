import java.util.*;
public class Lab10_Part1 {
	public static void main(String[] args) {
		String ph= "(";
		System.out.print("Enter p#: ");
		Scanner stdin = new Scanner(System.in);
		stdin.useDelimiter("");
		for(int i = 0; i<10;i++) {
			ph += stdin.next();
			if(i==2) {
				ph += ")";
			}
			if(i==5) {
				ph += "-";
			}
		}
		System.out.print("Formated p#: " + ph);
		stdin.close();
	}

}
