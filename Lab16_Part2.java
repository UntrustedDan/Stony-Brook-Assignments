import java.util.*;
public class Lab16_Part2 {
	public static void countOccurance(List<Integer> x) {
		int[] x_arr = new int[x.size()];
		for(int i=0; i<x.size();i++) {
			x_arr[i] = x.get(i);
		}
		for(int i=0; i<x_arr.length;i++) {
			int n=0;
			int num = x_arr[i];
			if(num==0) {
				continue;
			}
			else {
				for(int j=0;j<x_arr.length;j++) {
					if(num==x_arr[j]) {
						n++;
						x_arr[j] = 0;
					}
				}
				System.out.println(num + " occurs " + n + " time(s)");
			}
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int i = 0;
		System.out.print("Enter integers from 1 to 100. (0 as final integer): ");
		Scanner stdin = new Scanner(System.in);
		while(true) {
			numbers.add(stdin.nextInt());
			if(numbers.get(i) == 0) {
				break;
			}
			i++;
		}
		countOccurance(numbers);
		stdin.close();
		

	}

}
