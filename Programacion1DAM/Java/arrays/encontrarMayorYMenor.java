package arrays;

public class encontrarMayorYMenor {

	public static void main(String[] args) {

		int[] numeros = {

				10, 30, 5, 8, 7, 14, 18, 42, 9, 10

		};

		int mayor = numeros[0];
		int menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];

				for (int j = 1; i < numeros.length; i++) {
					if (numeros[i] < menor) {
						menor = numeros[i];
					}
				}
			}
		}

		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}
