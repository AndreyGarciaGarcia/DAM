package EstructurasDeControl;

import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un número entero: ");
		int numero = sc.nextInt();

		System.out.println("Tabla de multiplicar de " + numero + ":");
		for (int i = 1; i <= 10; i++) {

			int resultado = numero * i;

			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}

}
