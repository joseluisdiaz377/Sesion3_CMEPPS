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
		cta12345 = new Cuenta(50);
		cta67890 = new Cuenta(0);
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
//		assertTrue(ctaPruebas.retirar(4000)); // tiene que dar false porque no hay saldo suficiente
		assertTrue(ctaPruebas.retirar(3000));  //tiene que dar true porques hay saldo suficiente		

	}

	@Test
	void test0014_12345() {

		cta12345.retirar(200);
		assertEquals(-150, cta12345.getSaldo());
		
		cta12345.ingresar(100);
		assertEquals(-50, cta12345.getSaldo());
		
		cta12345.retirar(200);
		assertEquals(-250, cta12345.getSaldo());


	}

	@Test
	void test0014_67890() {
		
		cta67890.retirar(350);
		assertEquals(-350, cta67890.getSaldo());
		
		assertFalse(cta67890.retirar(200));  //no se puede retirar pq quedaria la cuenta en -550
		
		cta67890.retirar(150);
		assertEquals(-500, cta67890.getSaldo());
		
		cta67890.ingresar(50);
		assertEquals(-450, cta67890.getSaldo());
		
		assertFalse(cta67890.retirar(100)); //no se puede porque quedaría en -550 
	}

}
