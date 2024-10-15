package practicasBasicas;

import java.util.Scanner;

public class mayorIgualQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un primer numero");
		int num1 = sc.nextInt();

		System.out.println("Ingresa un segundo numero");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor que " + num2);
		} else {
			if (num2 > num1) {
				System.out.println("El numero " + num2 + " es mayor que " + num1);
			} else {
				if (num1 == num2) {
					System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");
				}
			}
		}

	}

}
