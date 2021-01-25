package com.alumne.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

class TestCalculadora {

	@Test
	public void testExecutarOperacioSuma() {

		Calculadora calculadora;
		calculadora = new Calculadora(false);

		int resultat_actual, resultat_esperat;

		calculadora.operacio = "+";
		calculadora.valor1 = 5;
		calculadora.valor2 = 10;

		resultat_actual = calculadora.executarOperacio();
		resultat_esperat = 5 + 10;

		assertEquals(resultat_esperat, resultat_actual, "Error en la suma!");
	}

	@Test
	public void testExecutarOperacioResta() {

		Calculadora calculadora;
		calculadora = new Calculadora(false);

		int resultat_actual, resultat_esperat;

		calculadora.operacio = "-";
		calculadora.valor1 = 5;
		calculadora.valor2 = 10;

		resultat_actual = calculadora.executarOperacio();
		resultat_esperat = 5 - 10;

		assertEquals(resultat_esperat, resultat_actual, "Error en la resta!");
	}

	@Test
	public void testExecutarOperacioMultiplicacio() {

		Calculadora calculadora;
		calculadora = new Calculadora(false);

		int resultat_actual, resultat_esperat;

		calculadora.operacio = "*";
		calculadora.valor1 = 5;
		calculadora.valor2 = 10;

		resultat_actual = calculadora.executarOperacio();
		resultat_esperat = 5 * 10;

		assertEquals(resultat_esperat, resultat_actual, "Error en la multiplicació!");
	}

	@Test
	public void testExecutarOperacioDivisio() {

		Calculadora calculadora;
		calculadora = new Calculadora(false);

		int resultat_actual, resultat_esperat;

		calculadora.operacio = "/";
		calculadora.valor1 = 5;
		calculadora.valor2 = 10;

		resultat_actual = calculadora.executarOperacio();
		resultat_esperat = 5 / 10;

		assertEquals(resultat_esperat, resultat_actual, "Error en la divisió!");
	}
	 
	@Test
	public void testExecutarOperacioDivisioZero() {

		Calculadora calculadora;
		calculadora = new Calculadora(false);

		int resultat_actual, resultat_esperat;

		calculadora.operacio = "/";
		calculadora.valor1 = 5;
		calculadora.valor2 = 0;

		//resultat_actual = calculadora.executarOperacio();
		//resultat_esperat = 5 / 0;

		//(expected=ArithmeticException.class)
		//Assertions.assertThrows(IllegalArgumentException.class, () -> m.div(5, 0));
		//assertThrows(ArithmeticException.class, () -> calculadora.executarOperacio(), "Error en la divisió!");
		//assertThrows(ArithmeticException.class, () -> calculadora.executarOperacio());
		
		Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.executarOperacio());
		
		//L'assercio mira si el text de l'excepcio avisa de divisio per zero
		assertEquals("/ by zero", exception.getMessage());
		
		
	}

}
