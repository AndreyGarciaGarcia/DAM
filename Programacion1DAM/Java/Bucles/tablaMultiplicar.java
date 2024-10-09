package Bucles;

import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero entero:");
		int numero = sc.nextInt();

		int resultado = 0;
		int i = 0;

		for (i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " * " + i + ": " + resultado);
		}
	}

}
