package Bucles;

import java.util.Scanner;

public class sumaNumsParesEImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el numero " + (i + 1));
			int numero = sc.nextInt();

			if (numero % 2 == 0) {
				System.out.println(numero + " es par");
			} else {
				System.out.println(numero + " es impar");
			}

		}

		System.out.println("La suma de los numeros pares es: " + numPar);
		System.out.println("La suma de los numetos impares es: " + numImpar);

	}

}
