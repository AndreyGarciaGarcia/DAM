package Bucles;

public class numsPrimosEntre1Y100 {

	public static void main(String[] args) {
		

		for (int num = 2; num <= 100; num++) {
			boolean primo = true;
			
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					primo = false;
					break;
				}
		}

		if (primo) {

			System.out.println(num + " primo");

		}

		else {
			System.out.println(num + " no primo");
		}

	}
}

}
