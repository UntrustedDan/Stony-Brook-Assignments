import java.util.Scanner;
public class Lab11_Part2 {

	public static void main(String[] args) {
		String[] in;
		String out= "";
		System.out.print("Enter date in MM/DD/YYYY format: ");
		Scanner stdin = new Scanner(System.in);
		in = stdin.nextLine().split("/");
		for(int i=0;i<=2;i++) {
			System.out.println(in[i]);
			if(i==0) {
				switch(in[i]) {
				case "01": out += "January ";
				break;
				case "02": out += "February ";
				break;
				case "03": out += "March ";
				break;
				case "04": out += "April ";
				break;
				case "05": out += "May ";
				break;
				case "06": out += "June ";
				break;
				case "07": out += "July ";
				break;
				case "08": out += "August ";
				break;
				case "09": out += "September ";
				break;
				case "10": out += "October ";
				break;
				case "11": out += "November ";
				break;
				case "12": out += "December ";
				break;
				}
			}
			else if(i==1) {
				out += in[i];
			}
			else {
				out += ", " + in[i];
			}
		}
		System.out.print(out);
		stdin.close();
		

	}

}
