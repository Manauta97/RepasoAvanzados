package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Ra�l Manauta Jarque
 * @version 1.0
 * @date 11/12/2019
 *
 */
public class Ejercicios {

	public static void Ejer1() {
		/**
		 * Escribe un n�mero y te dice si es perfecto o no
		 */
		Scanner leer = new Scanner(System.in);
		int num = 0, suma = 0;
		boolean bandera = true;
		do {
			try {
				leer = new Scanner(System.in);
				bandera = true;
				System.out.println("Escriba un n�mero entero positivo: ");
				num = leer.nextInt();
			} catch (InputMismatchException e) {
				bandera = false;
				System.out.println("datos introducidos no correctos");
			} catch (Exception e) {
				System.out.println("datos mal introducidos");
				bandera = false;
			}
			
		} while (!bandera);

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				suma = suma + i;
			}
		}

		if (suma == num) {
			System.out.println("El n�mero " + num + " es perfecto");
		} else {
			System.out.println("El n�mero: " + num + " no es perfecto");
		}

	}
	
	public static void ejer2() {
		/**
		 * Comprueba que el a�o introducido es bisiesto
		 */
		Scanner leer = new Scanner(System.in);
		int anyo = 0;
		
		System.out.println("Dime el a�o que quieres comprobar si es bisiesto");
		anyo = leer.nextInt();
		
		
		
	}

}
