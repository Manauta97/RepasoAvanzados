package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ejer.Ejercicios;

class testAmpliacion {

	@Test
	void testEjercicio1_1() {
		assertEquals(true, Ejercicios.Ejer1(496));
	}

	@Test
	void testEjercicio1_2() {
		assertEquals(true, Ejercicios.Ejer1(6));
	}

}
