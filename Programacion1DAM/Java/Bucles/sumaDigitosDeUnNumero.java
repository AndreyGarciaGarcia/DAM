package Bucles;

import java.util.Scanner;

public class sumaDigitosDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero entero:");
		int numEntero = sc.nextInt();

		int suma = 0;


			while (numEntero > 0) {
			int digito = numEntero % 10;
			suma += digito;
			numEntero /= 10;
			}
			System.out.println("La suma es: " + suma);

	}

}
