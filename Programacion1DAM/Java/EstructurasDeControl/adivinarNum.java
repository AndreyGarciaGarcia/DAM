package EstructurasDeControl;

import java.util.Scanner;

public class adivinarNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un número entero positivo: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Por favor, ingrese un número entero positivo.");
		} else {

			int contador = 0;
			while (numero > 0) {
				numero /= 10;
				contador++;
			}

			System.out.println("El número tiene " + contador + " dígitos.");
		}

	}

}
