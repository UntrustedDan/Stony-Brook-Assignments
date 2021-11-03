import java.util.*;
public class Lab15_Part1 {
	
	public static double deviation(double[] x, double mean) {
		double stdev=0;
		for(int i=0;i<10;i++) {
			stdev += Math.pow(x[i] - mean, 2);
		}
		stdev /= 9;
		stdev = Math.pow(stdev, 0.5);
		return stdev;
	}
	
	public static double mean(double[] x) {
		double mean=0;
		for(int i=0;i<10;i++) {
			mean += x[i];
		}
		mean /= 10;
		return mean;
	}
	

	public static void main(String[] args) {
		double mean, stdev;
		System.out.print("Enter 10 numbers: ");
		Scanner stdin = new Scanner(System.in);
		double[] in = new double[10];
		for(int i=0; i<10; i++) {
			in[i]=stdin.nextDouble();
		}
		mean = mean(in);
		stdev = deviation(in, mean);
		System.out.println(mean);
		System.out.println(stdev);
		stdin.close();
	}

}
