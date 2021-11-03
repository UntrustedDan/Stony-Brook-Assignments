//Daniel Grabowski, 112234272
import java.util.*;

public class Homework2_Part1 {

	public static void main(String[] args) {
		double upper;
		System.out.println("Enter upper limit: ");
		Scanner stdin = new Scanner(System.in);
		upper = stdin.nextDouble();
		
		//Iterate through each number until upper
		int i = 1;
		while(i<=upper) {
			
			//Find all factors of i and store them
			int n = 1, sum = 0;
			List<Integer> f = new ArrayList();
			while(n<= i) {
				if(i%n == 0) {
					f.add(n);
				}
				n++;
			}
			
			//Add all values in f
			for(int p = 0; p < (f.size() - 1); p++) {
				sum += f.get(p);
			}
			
			//Perfect number? Print
			if(sum == i) {
				System.out.println(i);
			}
			i++;
		}
		stdin.close();
	}

}
