package arrays;

import java.util.HashSet;

public class numerosRepetidos {

	public static void main(String[] args) {

		int[] numeros = { 10, 10, 23, 34, 5, 6, 7, 8, 7, 3 };

		HashSet<Integer> vistos = new HashSet<>();
		HashSet<Integer> duplicados = new HashSet<>();

		for (int i : numeros) {
			if (!vistos.add(i)) {
				duplicados.add(i);
			}
		}

		if (duplicados.isEmpty()) {
			System.out.println("No hay repetidos");
		} else {
			System.out.println("Numeros rpeetidos");
			for (int j : duplicados) {
				System.out.println(j + "");
			}
		}

	}

}
