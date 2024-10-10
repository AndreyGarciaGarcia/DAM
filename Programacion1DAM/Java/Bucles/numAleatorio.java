package Bucles;

import java.util.Random;
import java.util.Scanner;

public class numAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numAleatorio = random.nextInt(100) + 1;
		int numUsuario = 0;
		int intentos = 0;

		while (numUsuario != numAleatorio) {
			System.out.println("Adivina el numero entre 1 y 100");
			numUsuario = sc.nextInt();

			if (numUsuario < numAleatorio) {
				System.out.println("El numero es mayor");
			} else if (numUsuario > numAleatorio) {
				System.out.println("El numero es menor");
			} else {
				System.out.println("Acertaste");
			}
			intentos++;
		}

	}

}
