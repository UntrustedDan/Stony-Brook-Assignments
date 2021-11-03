
public class Lab11_Part1 {

	public static void main(String[] args) {
		double sum=0,i = 1;
		while(i<=97) {
			sum += i/(i+2);
			i +=2;
		}
		System.out.print(sum);

	}

}
