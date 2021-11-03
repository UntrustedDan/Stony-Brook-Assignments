import java.util.*;
public class Lab9_Part2 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		System.out.print("Input city one: ");
		Scanner stdin = new Scanner(System.in);
		cities.add(stdin.nextLine());
		System.out.print("Input city two: ");
		cities.add(stdin.nextLine());
		System.out.print("Input city three: ");
		cities.add(stdin.nextLine());
		java.util.Collections.sort(cities);
		System.out.println(cities);
		stdin.close();
		
		
	}

}
