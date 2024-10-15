package arrays;

public class FusionArrays {

	public static void main(String[] args) {

		// Creamos tres variables
		int[] Array1 = { 1, 2, 3 };
		int[] Array2 = { 4, 5, 6 };

		int[] fusion = new int[Array1.length + Array2.length];
		
		System.arraycopy(Array1, 0, fusion, 0, Array1.length);
		System.arraycopy(Array2, 0, fusion, Array1.length, Array2.length);

		System.out.println("Esta es la fusion:");

		// Uso del for
		for (int i : fusion) {
			System.out.println(i + "");
		}
	}

}
