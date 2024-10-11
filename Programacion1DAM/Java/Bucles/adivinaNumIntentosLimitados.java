package Bucles;

import java.util.Random;
import java.util.Scanner;

public class adivinaNumIntentosLimitados {

	public static void main(String[] args) {
		Random random = new Random();
		int numAleatorio = random.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);


		for (int intentos = 1; intentos <= 5; intentos++) {
			System.out.println("Introduce un numero entre 1 y 100");
			int numUser = sc.nextInt();

			if (numUser == numAleatorio) {
				System.out.println("Felicidades");
				break;
			} else if (numUser < numAleatorio) {
					System.out.println("El numero es mayor");
				} else {
					System.out.println("El numero es menor");
				}

				if (intentos == 5) {
					System.out.println("Sintiendolo mucho no has acertado el numero. El numero era: " + numAleatorio);
				}
			}
		}

	}
