package Bucles;

import java.util.Scanner;

public class promedioSerieNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int suma = 0;
		int contador = 0;

		System.out.println("Ingresa numeros:");
		numero = sc.nextInt();

		while (numero != -1) {
				suma += numero;
				contador++;

				numero = sc.nextInt();
		}
		if (contador > 0) {
			double promedio = (double) suma / contador;
			System.out.println("El promedio de los numeros es: " + promedio);
		} else {
			System.out.println("Numero no valido");
		}
	}

}
