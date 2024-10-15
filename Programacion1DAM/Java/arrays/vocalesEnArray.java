package arrays;

import java.util.Scanner;

public class vocalesEnArray {

	public static void main(String[] args) {

		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String frase = sc.nextLine().toLowerCase();

		int[] contadorVocales = new int[vocales.length];

		for (int i = 0; i < vocales.length; i++) {
			char letra = frase.charAt(i);
			for (int j = 0; j < vocales.length; j++) {
				if (letra == vocales[j]) {
					contadorVocales[j]++;
				}
			}
		}
		for (int i = 0; i < vocales.length; i++) {
			System.out.println(vocales[i] + " " + contadorVocales[i]);
		}
	}
}
