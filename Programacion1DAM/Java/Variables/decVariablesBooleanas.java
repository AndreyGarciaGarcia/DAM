package Variables;

public class decVariablesBooleanas {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		boolean resultAnd = a && b;
		System.out.println("El resultado de a AND b es: " + resultAnd);

		boolean resultOr = a || b;
		System.out.println("El resultado de a OR b es: " + resultOr);

		boolean resultNotA = !a;
		boolean resultNotB = !b;
		System.out.println("El resultado de NOT a: " + resultNotA);
		System.out.println("El resultado de NOT b: " + resultNotB);

	}

}
