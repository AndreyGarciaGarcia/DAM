package practicasBasicas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class contVocales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto = JOptionPane.showInputDialog(null, "Escribe una cadena", "Insercion",
				JOptionPane.INFORMATION_MESSAGE);
		texto = texto.toLowerCase();

		char vocales[] = { 'a', 'e', 'i', 'o', 'u' };

		char caracterActual;
		int contador = 0;

		for (int i = 0; i < texto.length(); i++) {
			caracterActual = texto.charAt(i);

			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == caracterActual) {
					contador++;
				}
			}
		}

		JOptionPane.showMessageDialog(null, contador, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
