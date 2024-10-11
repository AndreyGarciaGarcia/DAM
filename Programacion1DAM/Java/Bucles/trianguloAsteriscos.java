package Bucles;

import java.util.Scanner;

public class trianguloAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero entero:");
		int num = sc.nextInt();

		int i = 0;
		int j = 0;

		for (i = 1; i <= num; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}



	}

}
