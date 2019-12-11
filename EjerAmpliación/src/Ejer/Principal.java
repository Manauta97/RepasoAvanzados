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
				Ejercicios.Ejer1();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.out.println("Has salido de la aplicación");
				break;
			}
		} while (opc != 7);

	}

}
