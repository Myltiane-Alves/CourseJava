import java.util.Locale;
import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
		//casas decimais conforme exemplos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("A=%.4f%n", A);
		
		sc.close();
		
		

	}

}
