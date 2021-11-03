import java.util.*;
public class Lab14_Part2 {

	public static void main(String[] args) {
		List<Double> pfactors = new ArrayList<Double>();
		for(int i=2,n=1000;i<n;i++) {
			boolean prime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					prime = false;
					break;
				}
				else {
					prime = true;
					}
				}
				if(prime==true) {
					pfactors.add((double) i);
				}
				
			}
		for(int i=0;i<pfactors.size()-1;i++) {
			if(pfactors.get(i+1)-pfactors.get(i)==2) {
				double a = pfactors.get(i), b = pfactors.get(i+1);
				int ai = (int) a, bi = (int) b;
				System.out.println("("+ ai +","+ bi +")");				
			}
		}
		}
	}