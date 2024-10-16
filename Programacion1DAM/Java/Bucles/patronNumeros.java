package Bucles;

import java.util.Scanner;

public class patronNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero entero:");
		int n = sc.nextInt();

		int i = 0;
		int j = 0;
		int contador = 0;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				contador = i;
				System.out.print(contador);
			}

			System.out.println();
		}
	}

}
