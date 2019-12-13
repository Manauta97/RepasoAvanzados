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
	
	@Test
	void testEjercicio1_3() {
		assertEquals(false, Ejercicios.Ejer1(9));
	}
	
	@Test
	void testEjercicio1_4() {
		assertEquals(false, Ejercicios.Ejer1(32));
	}
	
	@Test
	void testEjercicio2_1() {
		assertEquals(true, Ejercicios.ejer2(2020));
	}
	@Test
	void testEjercicio2_2() {
		assertEquals(true, Ejercicios.ejer2(1924));
	}
	
	@Test
	void testEjercicio2_3() {
		assertEquals(false, Ejercicios.ejer2(2019));
	}
	
	@Test
	void testEjercicio2_4() {
		assertEquals(false, Ejercicios.ejer2(1997));
	}
	
	@Test
	void testEjercicio3_1() {
		assertEquals("14/12/2019", Ejercicios.ejer3(20191214));
	}
	
}
