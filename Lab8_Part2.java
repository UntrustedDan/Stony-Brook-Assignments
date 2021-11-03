
public class Lab8_Part2 {

	public static void main(String[] args) {
		int r, i = 0;
		char c;
		String p = "";
		while(i!=3) {
			r = (int) ((Math.random()*26)+65);
			c = (char) r;
			p += c;
			i++;
		}
		while(i!=7) {
			r = (int) (Math.random()*9);
			p += String.valueOf(r);
			i++;
		}
		System.out.print(p);
	}

}
