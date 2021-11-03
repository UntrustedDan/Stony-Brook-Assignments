public class Lab9_Part1 {

	public static void main(String[] args) {
		int i=0;
		double avg = 0, r;
		while(i<10) {
			r = Math.random()*100;
			System.out.println(r);
			avg += r;
			i++;
		}
		avg /= 10;
		System.out.println(avg);
	}

}
