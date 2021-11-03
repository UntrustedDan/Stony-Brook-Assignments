import java.util.*;
public class Lab13_Part1 {
	public static void displayPattern(int n) {
		for(int i = 0; i<=n;i++) {
			for(int j = n;j>= i; j--) {
				System.out.format("%-10s", " ");;
			}
			for(int j = i; j> 0; j--) {
				System.out.format("%-10d", j);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int n;
		System.out.print("input: ");
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		displayPattern(n);
		stdin.close();

	}

}
