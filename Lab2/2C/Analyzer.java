import java.util.*;

public class Analyzer{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Data a = new Data();


		String s;
		int n;

		while (true) {
			s = scan.next();
			if(s.equals("Q")) break;
			else{
				n = Integer.parseInt(s);
				a.SetValue(n);
			}
		}

		System.out.println("Average = " + a.GetAverage());
		System.out.println("Maximum = " + a.GetMax());


	}
}