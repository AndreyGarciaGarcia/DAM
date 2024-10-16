package practicasBasicas;

import java.util.Scanner;

public class remplazarLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una cadena de texto");
		String cadena = sc.nextLine();

		cadena = cadena.replace("a", "e");

		System.out.println("Esta es la cadena de texto con la letra cambiada:");
		System.out.println(cadena);

	}

}
