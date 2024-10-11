package Bucles;

import java.util.Scanner;

public class cadenaVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una frase:");
		String frase = sc.nextLine();

		int vocales = 0;

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vocales++;
			}
		}

		System.out.println("El numero de vocales en la frase es: " + vocales);

	}

}
