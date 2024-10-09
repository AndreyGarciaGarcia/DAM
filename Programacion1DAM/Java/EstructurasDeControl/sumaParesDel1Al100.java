package EstructurasDeControl;

public class sumaParesDel1Al100 {

	public static void main(String[] args) {

		int suma = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}

		System.out.println("La suma de los numeros pares es: " + suma);

	}

}
