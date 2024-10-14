package arrays;

public class invertirArray {

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4, 5 };
		int[] Inverso = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			Inverso[i] = numeros[numeros.length - 1 - i];
		}

		System.out.println("Ordenado");
		for (int i : numeros) {
			System.out.println(i + "");
		}

		System.out.println("Inverso");
		for (int i : Inverso) {
			System.out.println(i + "");
		}

	}

}
