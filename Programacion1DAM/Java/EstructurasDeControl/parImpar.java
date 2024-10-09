package EstructurasDeControl;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero entero:");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es par");
		} else {
			System.out.println("El numero " + num + " es impar");
		}

	}

}
