package EstructurasDeControl;

import java.util.Scanner;

public class calificacionSegunPuntuacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese una puntuación de 0 a 100: ");
		int puntuacion = sc.nextInt();

		if (puntuacion < 0 || puntuacion > 100) {
			System.out.println("Puntuación no válida. Debes estar entre 0 y 100.");
		} else {

			if (puntuacion >= 90) {
				System.out.println("Calificación: A");
			} else if (puntuacion >= 80) {
				System.out.println("Calificación: B");
			} else if (puntuacion >= 70) {
				System.out.println("Calificación: C");
			} else if (puntuacion >= 60) {
				System.out.println("Calificación: D");
			} else {
				System.out.println("Calificación: F");
			}
		}

	}

}
