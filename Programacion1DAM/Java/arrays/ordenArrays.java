package arrays;

import java.util.Arrays;
import java.util.Random;

public class ordenArrays {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		Random rd = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(100);
		}

		System.out.println("Array verdadero " + Arrays.toString(numeros));

		Arrays.sort(numeros);

		System.out.println("Ordenado " + Arrays.toString(numeros));

	}

}
