import java.util.*;
public class Homework4_Part2 {
	
	public static int[] merge(int[] list1, int[] list2){
		int[] merged_list = new int[list1.length+list2.length];
		for(int i=0;i<list1.length;i++) {
			merged_list[i]=list1[i];
		}
		for(int i=0,j=list1.length;i<list2.length;i++,j++) {
			merged_list[j]=list2[i];
		}
		Arrays.sort(merged_list);
		return merged_list;
	}

	public static void main(String[] args) {
		System.out.print("Enter list1 size and contents: ");
		Scanner stdin = new Scanner(System.in);
		int[] list1 = new int[stdin.nextInt()];
		for(int i=0; i<list1.length;i++) {
			list1[i]= stdin.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int[] list2 = new int[stdin.nextInt()];
		for(int i=0; i<list2.length;i++) {
			list2[i]= stdin.nextInt();
		}
		Arrays.sort(list1);
		Arrays.sort(list2);
		System.out.println("List 1 is " + Arrays.toString(list1));
		System.out.println("List 2 is " + Arrays.toString(list2));
		int[] listf = merge(list1, list2);
		System.out.println("Merged list is " + Arrays.toString(listf));
		stdin.close();

	}

}
