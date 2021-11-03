import java.util.*;
public class Lab16_Part1 {

	public static void main(String[] args) {
		int n, highest=0;
		System.out.print("Number of Students: ");
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		int[] grades = new int[n];
		System.out.print("Enter " + n + " scores: ");
		for(int i=0; i<n; i++) {
			grades[i]=stdin.nextInt();
			if(grades[i]>highest) {
				highest = grades[i];
			}
		}
		for(int i=0; i<n; i++) {
			if(grades[i]>=highest-10) {
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is A");
			}
			else if(grades[i]>=highest-20) {
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is B");
			}
			else if(grades[i]>=highest-30) {
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is C");
			}
			else if(grades[i]>=highest-40) {
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is D");
			}
			else {
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is F");
			}
		}
		stdin.close();
	}

}
