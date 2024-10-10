package Bucles;

import java.util.Scanner;

public class numDigitosDeNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero entero:");
		int numEntero = sc.nextInt();

		int digitos = 0;

		if (numEntero == 0) {
			digitos = 1;
		} else {
			while (numEntero != 0) {
				numEntero /= 10;
				digitos++;
			}
		}
		System.out.println("El numero introducido tiene " + digitos + " digitos");
	}


}
