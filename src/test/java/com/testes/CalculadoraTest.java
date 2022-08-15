package com.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTest {
	//preparação
	Calculadora calculadora;
	double n1;
	double n2;
	
	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
		n2 = 10.0;
		n1 = 20.0;
	}
	
	
	@Test
	void testarSomaComResultadoCorreto() {	
		double resultadoEsperado = 30.0;
		double resultadoExecucao = calculadora.somar(n1, n2);
		assertEquals(resultadoEsperado, resultadoExecucao);
	}
	
	@Test
	void testarSomaComResultadoInCorreto() {
		double resultadoEsperado = 40;
		double resultadoExecucao = calculadora.somar(10.0, 20.0);
		assertNotEquals(resultadoEsperado, resultadoExecucao );
	}
	
	@Test
	void testarSubtracaoComResultadoCorreto() {	
		double resultadoEsperado = 10.0;
		double resultadoExecucao = calculadora.subtrair(n1, n2);
		assertEquals(resultadoEsperado, resultadoExecucao);
	}
	
	@Test
	void testarSubtracaoComResultadoInCorreto() {
		double resultadoEsperado = 30;
		double resultadoExecucao = calculadora.subtrair(20.0, 10.0);
		assertNotEquals(resultadoEsperado, resultadoExecucao);
	}
	
	@Test
	void testarMultiplicacaoComResultadoCorreto() {	
		double resultadoEsperado = 200.0;
		double resultadoExecucao = calculadora.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, resultadoExecucao);
	}
	
	@Test
	void testarMultiplicacaoComResultadoInCorreto() {
		double resultadoEsperado = 12;
		assertNotEquals(resultadoEsperado, calculadora.multiplicar(2.0, 10.0));
	}
	
	@Test
	void testarDivisaoporZero() {
		Exception exception = assertThrows(ArithmeticException.class,() -> calculadora.dividir(n1,0)) ;
		assertEquals("Não pode ser dividido por zero", exception.getMessage());
	}
	@Test
	void testarDivisaoComResultadoCorretoDiferentedeZero() throws Exception{	
		double resultadoEsperado = 2.0;
		double resultadoExecucao = calculadora.dividir(n1, n2);
		assertEquals(resultadoEsperado, resultadoExecucao);
	}
	
	@Test
	void testarDivisaoComResultadoInCorretoDiferentedeZero() {
		double resultadoEsperado = 5;
		try {
		assertNotEquals(resultadoEsperado, calculadora.dividir(n1, n2));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
