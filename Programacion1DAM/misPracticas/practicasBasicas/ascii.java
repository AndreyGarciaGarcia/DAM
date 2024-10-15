package practicasBasicas;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numero = sc.nextInt();

		// Variable char (caracter)
		char caracter = (char) numero;

		System.out.println("El numero " + numero + " en codigo ASCII es: " + caracter);

	}

}
