package arrays;

public class promedio {

	public static void main(String[] args) {

		int[] numeros = { 5, 6, 8, 4, 10, 23 };

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println("La suma es: " + suma);

		System.out.println("El promedio es: " + (suma / 6));

	}

}
