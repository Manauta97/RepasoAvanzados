package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Raúl Manauta Jarque
 * @version 1.0
 * @date 11/12/2019
 *
 */
public class Ejercicios {

	public static boolean Ejer1(int num) {
		/**
		 * Escribe un número y te dice si es perfecto o no
		 */
		Scanner leer = new Scanner(System.in);
		int suma = 0;
		boolean bandera = true;
//		do {
//			try {
//				leer = new Scanner(System.in);
//				bandera = true;
//				System.out.println("Escriba un número entero positivo: ");
//				num = leer.nextInt();
//			} catch (InputMismatchException e) {
//				bandera = false;
//				System.out.println("datos introducidos no correctos");
//			} catch (Exception e) {
//				System.out.println("datos mal introducidos");
//				bandera = false;
//			}
//
//		} while (!bandera);

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				suma = suma + i;
			}
		}

		if (suma == num) {
			System.out.println("El número " + num + " es perfecto");
			return bandera=true;

		} else {
			System.out.println("El número: " + num + " no es perfecto");
			return bandera = false;

		}

	}

	public static void ejer2() {
		/**
		 * Comprueba que el año introducido es bisiesto
		 */
		Scanner leer = new Scanner(System.in);
		int anyo = 0;
		boolean dato = true;
		do {
			try {
				System.out.println("Dime el año que quieres comprobar si es bisiesto");
				anyo = leer.nextInt();
				dato = true;
			} catch (InputMismatchException e) {
				dato = false;
				System.out.println("datos mal introducidos");
			} catch (Exception e) {
				dato = false;
				System.out.println("error desconocido");
			}
		} while (!dato);

		if ((anyo % 4 == 0) && (anyo % 100 != 0) && (anyo % 400 != 0)) {
			System.out.println("El año " + anyo + " es bisiesto");
		} else {
			System.out.println("El año " + anyo + " no es bisiesto");
		}

	}

	public static void ejer3() {
		/**
		 * introduces una fecha y la imprime en el formato indicado
		 */
		Scanner leer = new Scanner(System.in);
		int fecha = 0;
		boolean bandera = true;
		String fechaString = "";

		do {
			try {
				System.out.println("introduce un digito de 8 cifras: aaaammdd");
				fecha = leer.nextInt();
				bandera = true;
				fechaString = Integer.toString(fecha);
				if (!(fechaString.length() == 8)) {
					bandera = false;
					System.out.println("El formato no es correcto");
				}
			} catch (InputMismatchException e) {
				bandera = false;
				System.out.println("datos mal introducidos");
			} catch (Exception e) {
				bandera = false;
				System.out.println("error desconocido");
			}
		} while (!bandera);

		System.out.println("La fecha introducida es: " + fechaString.substring(6, 8) + "/" + fechaString.substring(4, 6)
				+ "/" + fechaString.substring(0, 4));
	}

	public static void ejer4() {
		/**
		 * comprueba si un número es primo o no
		 */
		Scanner leer = new Scanner(System.in);
		int num = 0;
		boolean bandera = true, primo = true;

		do {
			try {
				System.out.println("Introduce un número");
				num = leer.nextInt();
				bandera = true;
			} catch (InputMismatchException e) {
				bandera = false;
				System.out.println("Datos mal introducidos");
			} catch (Exception e) {
				bandera = false;
				System.out.println("Datos mal introducidos");
			}
		} while (!bandera);

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo = true) {
			System.out.println("El numero " + num + " es primo");
		} else {
			System.out.println("El número " + num + " no es primo");
		}

	}

	public static void ejer5() {
		/**
		 * un número en base 10 lo pasa a binario
		 */
		Scanner leer = new Scanner(System.in);
		int num = 0;
		boolean bandera = true;

		do {
			try {
				System.out.println("introduce un número");
				num = leer.nextInt();
				bandera = true;
			} catch (InputMismatchException e) {
				bandera = false;
				System.out.println("datos mal introducidos");
			} catch (Exception e) {
				bandera = false;
				System.out.println("error desconocido");
			}
		} while (!bandera);

		do {

			for (int i = 1; i < num; i++) {
				if (num % 2 == 0) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
			}
		} while (num != 0);

	}

	public static void ejer6() {
		/**
		 * te dice de una serie de números cual es le mayor
		 */
		Scanner leer = new Scanner(System.in);
		int num = 0;
		boolean bandera = true;
		String numeroString = "";

		do {
			try {
				System.out.println("introduce un numero");
				num = leer.nextInt();
				bandera = true;
				numeroString = Integer.toString(num);
			} catch (InputMismatchException e) {
				bandera = false;
				System.out.println("datos mal introducidos");
			} catch (Exception e) {
				bandera = false;
				System.out.println("error desconocido");
			}
		} while (!bandera);

		for (int i = 0; i < numeroString.length(); i++) {

		}
	}

}
