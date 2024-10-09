package EstructurasDeControl;

import java.util.Scanner;

public class menuSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("\nSeleccione una opción:");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Salir");
			System.out.print("Ingrese su opción: ");
			opcion = sc.nextInt();

			if (opcion >= 1 && opcion <= 4) {
				System.out.print("Ingrese el primer número: ");
				int num1 = sc.nextInt();
				System.out.print("Ingrese el segundo número: ");
				int num2 = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("La suma es: " + (num1 + num2));
					break;
				case 2:
					System.out.println("La resta es: " + (num1 - num2));
					break;
				case 3:
					System.out.println("La multiplicación es: " + (num1 * num2));
					break;
				case 4:
					if (num2 != 0) {
						System.out.println("La división es: " + ((double) num1 / num2));
					} else {
						System.out.println("Error: No se puede dividir entre cero.");
					}
					break;
				}
			} else if (opcion != 5) {
				System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
			}

		} while (opcion != 5);

		System.out.println("Saliendo del programa.");

	}

}
