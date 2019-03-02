import java.util.Scanner;
public class QualityAdjustedLifeYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		double first;
		double second;
		double ans = 0;
		for(int y=0;y<x;y++) {
			first = s.nextDouble();
			second = s.nextDouble();
			ans = ans +(first*second);
		}
		System.out.println(ans);
	}

}
