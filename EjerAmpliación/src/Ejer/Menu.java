package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static int PintaMenu() {
		Scanner leer = new Scanner(System.in);

		int opc = 0;
		try {
			do {
				System.out.println("--------MENU--------");
				System.out.println("1. N�mero Perfecto");
				System.out.println("2. A�o Bisiesto");
				System.out.println("3. Decodificar fecha");
				System.out.println("4. N�mero Primo");
				System.out.println("5. Conversi�n a Binario");
				System.out.println("6. Cifra de Mayor Valor");
				System.out.println("7. Salir");
				opc = leer.nextInt();

			} while (opc > 7 || opc < 1);
		} catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("Datos mal introducidos");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("Datos mal introducidos");
		}
		
		return opc;
	}
}
