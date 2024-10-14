package arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		// for
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El numero en la posicion " + i + " es:");
		}

		// for each
		for (int i : numeros) {
			System.out.println("El numero es: " + i);
		}

	}

}
