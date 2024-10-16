package practicasBasicas;

import java.util.Scanner;

public class palabrasIguales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase1 = "";
		String frase2 = "";

		System.out.println("Ingresa la primera frase");
		frase1 = sc.nextLine();

		System.out.println("Ingrese la segunda frase");
		frase2 = sc.nextLine();

		if (frase1.equals(frase2)) {
			System.out.println("Las dos frase son iguales");
		} else {
			System.out.println("Las frase son distintas");
		}

	}

}
