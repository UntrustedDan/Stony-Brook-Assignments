//Daniel Grabowski, 112234272
import java.util.*;
public class Homework3_Part4 {
	
	public static boolean checkAnagram(String s1, String s2) {
		boolean isAnagram = false, loopBroken=false;
		s1 = s1.toLowerCase().replaceAll("\\s", "");
		s2 = s2.toLowerCase().replaceAll("\\s", "");
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		for(int i=0; i<sb1.length();i++) {
			if(sb2.toString()=="") {
				loopBroken=true;
				break;
			}
			for(int j=0;j<sb2.length();j++) {
				if(sb1.charAt(i)==sb2.charAt(j)) {
					sb2.deleteCharAt(j);
					break;
				}
			}
		}
		
		if(loopBroken == true) {
			return isAnagram;
		}
		else if(sb2.toString()==""){
			isAnagram = true;
		}		
		return isAnagram;
	}
	
	public static void main (String [ ] args) {
		String s1, s2;
		boolean isAnagram;
		System.out.print("Input first string: ");
		Scanner stdin = new Scanner(System.in);
		s1 = stdin.nextLine();
		System.out.print("Input second string: ");
		s2 = stdin.nextLine();
		isAnagram = checkAnagram(s1, s2);
		System.out.print(s1 + " and "+ s2 + " are anagrams: " + isAnagram);
		stdin.close();
		
	}

}
