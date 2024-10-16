package Bucles;

import java.util.Scanner;

public class tablaMultiplicarConDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resultado = 0;
		int i = 1;

		System.out.println("Ingresa un numero entero");
		int numero = sc.nextInt();
		
		do {
			resultado = numero * i;
			System.out.println("Resultado " + numero + " por " + i + " = " + resultado);
			i++;
		} while (resultado < numero * 10);


	}

}
