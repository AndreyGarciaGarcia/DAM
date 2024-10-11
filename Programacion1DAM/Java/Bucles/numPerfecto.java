package Bucles;

import java.util.Scanner;

public class numPerfecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero");
		int numero = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				sum += i;
			}
		}

		if (sum == numero) {
			System.out.println(numero + " es perfecto");
		} else {
			System.out.println(numero + " no es perfecto");
		}

	}

}
