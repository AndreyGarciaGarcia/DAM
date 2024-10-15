package practicasBasicas;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero no es par");
		}

	}

}
