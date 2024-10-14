package arrays;

public class sumaDeElementos {

	public static void main(String[] args) {

		int[] numeros = { 10, 30, 55, 60, 80 };

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		System.out.println("La suma de los elementos del array es: " + suma);
	}
}
