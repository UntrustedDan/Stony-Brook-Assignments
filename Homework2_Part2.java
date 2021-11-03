//Daniel Grabowski, 112234272
import java.util.*;
public class Homework2_Part2 {

	public static void main(String[] args) {
		int upper, lower;
		System.out.print("Enter lower limit: ");
		Scanner stdin = new Scanner(System.in);
		lower = stdin.nextInt();
		System.out.print("Enter upper limit: ");
		upper = stdin.nextInt();
		//Iterate from lower to upper
		while(lower<upper) {
			int temp = lower;
			int sum = 0;
			//Separate each number and input into a list
			List<Integer> d = new ArrayList();
			while(temp > 0) {
				int n = temp % 10;
				d.add(n);
				temp = temp / 10;
			}
			//Compute Armstrong number
			for(int i = 0; i < d.size();i++) {
				sum += Math.pow(d.get(i),d.size());
			}
			//Armstrong Number? Print
			if(sum == lower) {
				System.out.println(sum);
			}
			lower++;
			
		}
		stdin.close();

	}

}
