import java.util.Scanner;
public class Lab5_Part2 {

	public static void main(String[] args) {
		double w;
		System.out.print("Enter the weight of your package: ");
		Scanner stdin = new Scanner(System.in);
		w = stdin.nextDouble();
		if(w < 0) {
			System.out.print("Invalid package weight.");
		}
		else if(w > 0 & w <= 1) {
			System.out.print("Cost to ship is $3.50");
		}
		else if(w > 1 & w <= 3) {
			System.out.print("Cost to ship is $5.50");
		}
		else if(w > 3 & w <= 10) {
			System.out.print("Cost to ship is $8.50");
		}
		else if(w > 10 & w <= 20) {
			System.out.print("Cost to ship is $10.50");
		}
		else if(w > 20) {
			System.out.print("Can not ship packages weighing over 20 units.");
		}
		stdin.close();

	}

}
