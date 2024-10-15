package practicasBasicas;

import java.util.Scanner;

public class numerosHastaMenos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeros = sc.nextInt();
		
		while (numeros != -1) {
				numeros = sc.nextInt();
		}
	}
}
