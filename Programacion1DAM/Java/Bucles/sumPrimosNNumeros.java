package Bucles;

import java.util.Scanner;

public class sumPrimosNNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero entero positivo:");
		int numero = sc.nextInt();

		int suma = 0;

		for (int i = 1; i <= numero; i++) {
			suma += i;
		}

		System.out.println("La suma de los primeros " + numero + " numeros naturales es: " + suma);

	}

}
