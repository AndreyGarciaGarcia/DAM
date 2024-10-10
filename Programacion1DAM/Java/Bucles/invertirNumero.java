package Bucles;

import java.util.Scanner;

public class invertirNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int numInvertido = 0;
		int resto;

		System.out.println("Ingresa un numero entero");
		numero = sc.nextInt();

		while (numero > 0) {
			resto = numero % 10;
			numInvertido = numInvertido * 10 + resto; //
			numero /= 10;
		}

		System.out.println("Numero invertido = " + numInvertido);

	}

}
