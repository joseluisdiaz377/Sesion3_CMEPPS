package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta ctaPruebas;
	static Cuenta cta12345;
	static Cuenta cta67890;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta(0);
		cta12345 = new Cuenta (50);
		cta67890 = new Cuenta (0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPruebas.setSaldo(3000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		ctaPruebas.retirar(3000);
		assertEquals(0, ctaPruebas.getSaldo());
	}

	@Test
	void testIngresar() {
		ctaPruebas.ingresar(3000);
		assertEquals(6000, ctaPruebas.getSaldo());
	}
	
	@Test
	void testRetirarSinSaldo() {
		assertTrue(ctaPruebas.retirar(4000));  //tiene que dar false porque no hay saldo suficiente	
//		assertTrue(ctaPruebas.retirar(3000));  //tiene que dar true porques hay saldo suficiente		

	}
	
	@Test
	void test0014() {
		cta12345.retirar(200);
		cta67890.retirar(350);
		cta12345.ingresar(100);
		cta67890.retirar(200);
		cta67890.retirar(150);
		cta12345.retirar(200);
		cta67890.ingresar(50);
		cta67890.retirar(100);
		
		System.out.println("Cuenta 12345....");
		System.out.println("- Saldo Final: " + cta12345.getSaldo());
		
		System.out.println("");

		System.out.println("Cuenta 67890....");
		System.out.println("- Saldo Final: " + cta67890.getSaldo());

	}
	
	

	

}
