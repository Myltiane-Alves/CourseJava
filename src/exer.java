import java.util.Locale;
import java.util.Scanner;

public class exer {
	public static void exer() {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double r, a, pi = 3.14159;
		
		r = sc.nextDouble();
		a = pi * r * r;
		
		System.out.printf("A=%.4f%n", a);
		
		sc.close();
		
	}
}