package practicasBasicas;

public class arraySumaElementos {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 4, 5, 6 };

		int suma = 0;

		for (int i = 0; i < num1.length; i++) {
			suma += num1[i];
		}

		System.out.println("La suma de los numeros es: " + suma);

	}

}
