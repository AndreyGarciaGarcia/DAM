package Bucles;

import java.util.Scanner;

public class serieFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el numero de terminos para la serie de Fibonacci");
		int valor = sc.nextInt();

		int primero = 0;
		int segundo = 1;

		for (int i = 0; i < valor; i++) {
			if (i == 0) {
				System.out.println(primero);
				continue;
			}
			if (i == 1) {
				System.out.println(segundo);
				continue;
			}

			int sigTermino = primero + segundo;
			System.out.println(sigTermino);

			primero = segundo;
			segundo = sigTermino;
		}

	}

}
