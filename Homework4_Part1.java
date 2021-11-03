import java.util.*;
public class Homework4_Part1 {
	public static int[] eliminateDuplicate(int[] list) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int n=0;
		for(int i=0; i<list.length;i++) {
			int num = list[i];
			boolean duplicate = false;
			for(int j=0; j<numbers.size();j++) {
				if(num==numbers.get(j)) {
					duplicate = true;
				}
			}
			if(duplicate == true) {
				continue;
			}
			numbers.add(num);
			n++;
		}
		int[] new_array = new int[n];
		for(int i=0;i<n;i++) {
			new_array[i] = numbers.get(i);
		}
		return new_array;
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("Enter 10 integers: ");
		Scanner stdin = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=stdin.nextInt();
		}
		int[] new_arr = eliminateDuplicate(arr);
		System.out.print("Distinct integers: ");
		for(int i=0; i<new_arr.length;i++) {
			System.out.print(new_arr[i]+" ");
		}
		stdin.close();

	}

}
