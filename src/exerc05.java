import java.util.Locale;
import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		   hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		   decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
		

	}

}
