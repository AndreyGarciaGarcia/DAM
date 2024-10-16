package practicasBasicas;

import java.util.Scanner;

public class eliminarEspacios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una frase");
		String frase = sc.nextLine();

		char caracterActual;
		String textoSinEspacios = "";

		for (int i = 0; i < frase.length(); i++) {

			caracterActual = frase.charAt(i);

			if (caracterActual != ' ') {
				textoSinEspacios += caracterActual;
			}
		}
		System.out.println(textoSinEspacios);
	}

}
