package Variables;

public class calcPrecioFinalConIva {

	public static void main(String[] args) {

		double precio = 100;
		double iva = 21;

		double precioFinal = precio + (precio * iva / 100);

		System.out.println("El precio final con el iva es: " + precioFinal);

	}

}
