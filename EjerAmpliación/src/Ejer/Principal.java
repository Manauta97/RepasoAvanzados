package Ejer;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {
			opc = Menu.PintaMenu();
			
			switch (opc) {
			case 1:
				Ejercicios.Ejer1(32);
				break;
			case 2:
				Ejercicios.ejer2(1997);
				break;
			case 3:
				Ejercicios.ejer3(20191214);
				break;
			case 4:
				Ejercicios.ejer4();
				break;
			case 5:
				Ejercicios.ejer5();
				break;
			case 6:
				Ejercicios.ejer6();
				break;
			case 7:
				System.out.println("Has salido de la aplicaci�n");
				break;
			}
		} while (opc != 7);

	}

}
