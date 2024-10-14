package practicas;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Ingresa tu dni");
		String dni = sc.next();

		System.out.println("Ingresa tu nombre");
		String nombre = sc.next();

		System.out.println("Ingresa tu edad");
		int edad = sc.nextInt();
		
		while((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin")) {
			
			if(edad >= 6 && edad <= 10) {
				System.out.println("La categoria es menores A");
			}else {
				if(edad >= 11 && edad <= 17) {
					System.out.println("La categoria es menores B");
				}else {
					if(edad >= 18 && edad <= 30) {
						System.out.println("La categoria es Juvenines");
					}else {
						if(edad >= 31 && edad <= 50) {
							System.out.println("La categoria es Adultos");
						} else {
							if(edad >= 51) {
								System.out.println("La categoria es Adultos mayores");
							}
						}
					}
				}
			}
			
			System.out.println("Ingresa tu dni");
			dni = sc.next();
			
			System.out.println("Ingresa tu nombre");
			nombre = sc.next();
			
			System.out.println("Ingresa tu edad");
			edad = sc.nextInt();
		}

	}

}
