package practicasBasicas;

import java.util.Scanner;

public class sumaDel1AlnumeroIndicado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero mayor a 1");
		int numero;

		do {
			numero = sc.nextInt();

		} while (numero <= 1);

		int suma = 0;

		for (int i = 1; i < numero; i++) {
			suma += numero;
		}

		System.out.println("La suma es: " + suma);
	}

}
