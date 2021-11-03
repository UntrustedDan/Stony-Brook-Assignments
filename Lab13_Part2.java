import java.util.*;
public class Lab13_Part2 {
	
	public static void reverse(int number) {
		String a = String.valueOf(number), reversed = "";
		for(int i=a.length()-1;i>=0;i-- ) {
			reversed += a.charAt(i);
		}
		System.out.print(reversed);
		
	}

	public static void main(String[] args) {
		int in;
		System.out.print("Input: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextInt();
		reverse(in);
		stdin.close();

	}

}
