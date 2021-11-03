import java.util.*;
public class Lab15_Part2 {
	public static double[] reverse(double arr[]) {
		for(int i=0;i<5;i++) {
			double temp = arr[i];
			arr[i] = arr[9-i];
			arr[9-i]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.print("Input 10 numbers: ");
		Scanner stdin = new Scanner(System.in);
		double[] in = new double[10];
		for(int i=0; i<10; i++) {
			in[i]=stdin.nextDouble();
		}
		in = reverse(in);
		for(int i=0; i<10; i++) {
			System.out.println(in[i]);
		}
		stdin.close();

	}

}
