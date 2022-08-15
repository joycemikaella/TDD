package com.testes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayTest {
	String[] fruta = {"morango", "kiwi", "uva"};

	@Test
	@DisplayName("verifica se o array tem três elementos")
	public void testTamanhoArray() {
		assertTrue(fruta.length == 3);
	}
	
//	@DisplayName("verifica se o array tem o elemento kiwi")
//	public boolean testContidoArray(String fruta) {
//		for(String s: frutas) {
//			if(s.equals(fruta)) {
//				return true;
//			}
//			return false;
//		}
//	}
}